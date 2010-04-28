/*
 * Thibaut Colar Apr 28, 2010
 */
package net.colar.netbeans.fan.actions;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.netbeans.api.extexecution.ExternalProcessBuilder;

/**
 *
 * @author thibautc
 */
public class FanExecutionGroup extends Thread implements Callable<Process>
{

	private List<FanExecution> cmds = new ArrayList<FanExecution>();
	int exitValue = -1;
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	volatile boolean done = false;
	PipedInputStream globalInput = new PipedInputStream();
	PipedOutputStream globalOutput;

	public FanExecutionGroup(FanExecution... cmds)
	{
		this.cmds.addAll(Arrays.asList(cmds));
		try
		{
			globalOutput = new PipedOutputStream(globalInput);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public Process call() throws Exception
	{
		Process p = new FanExecGrpProcess();
		start();
		return p;
	}

	@Override
	public void run()
	{
		done = false;
		for (FanExecution cmd : cmds)
		{
			try
			{
				bos.write("ddfds\ndsfdfd\n".getBytes());
				ExternalProcessBuilder processBuilder = cmd.buildProcess();
				processBuilder.redirectErrorStream(true);
				Process sub = processBuilder.call();
				final InputStream processStream = sub.getInputStream();
				// outputReaderThread thread is reading that.
				new Thread(
					new Runnable()
					{
						public void run()
						{
							int i = 0;
							try
							{
							while((i=processStream.read())!=-1)
							{
								globalOutput.write(i);
								globalOutput.flush();
							}
							}catch(Exception e){e.printStackTrace();}
						}
					}).start();

				sub.waitFor();
				//outputReaderThread.flush();
				Integer result = sub.exitValue();
				exitValue = result;
				if (result != 0)
				{
					done = true;
					return;
				}
			} catch (Exception e)
			{
				e.printStackTrace();
				done = true;
				return;
			}
		}
		try
		{
			bos.flush();
			bos.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		done = true;
	}

	class FanExecGrpProcess extends Process
	{

		@Override
		public OutputStream getOutputStream()
		{
			// no need
			return new ByteArrayOutputStream();
		}

		@Override
		public InputStream getInputStream()
		{
			return globalInput;
		}

		@Override
		public InputStream getErrorStream()
		{
			// Errors sent int outputstream
			byte[] b =
			{
			};
			return new ByteArrayInputStream(b);
		}

		@Override
		public int waitFor() throws InterruptedException
		{
			while (!done)
			{
				sleep(200);
			}
			return exitValue();
		}

		@Override
		public int exitValue()
		{
			return exitValue;
		}

		@Override
		public void destroy()
		{
			bos = null;
			//TODO: stop all
		}
	}
}
