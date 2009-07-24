/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.io.IOException;
import org.netbeans.api.extexecution.input.InputProcessor;

public class FanOutputProcessor implements InputProcessor
{

    StringBuilder builder = new StringBuilder();

    public void processInput(char[] input) throws IOException
    {
	builder.append(input);
    }

    public void reset() throws IOException
    {
	//builder = new StringBuilder();
    }

    public void close() throws IOException
    {
    }

    public String getData()
    {
	return builder.toString();
    }
}
