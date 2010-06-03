/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parboiled;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.parboiled.MatchHandler;
import org.parboiled.MatcherContext;
import org.parboiled.RecoveringParseRunner;
import org.parboiled.Rule;
import org.parboiled.support.ParsingResult;

/**
 *
 * @author thibautc
 */
public class CancellableRecoveringParserRunner<V> extends RecoveringParseRunner<V>  implements Callable<ParsingResult>
{
  boolean cancelled = false;

  public CancellableRecoveringParserRunner(Rule rule, String input)
  {
    super(rule, input);
  }

  @Override
  protected boolean runRootContext(MatchHandler<V> handler)
  {
    return super.runRootContext(new CancellableHandler(handler));
  }

  public Future<ParsingResult> start() throws InterruptedException, ExecutionException
  {
    ExecutorService es = Executors.newSingleThreadExecutor ();
    Future<ParsingResult> future = es.submit(this);
    return future;
  }

  public void cancel()
  {
    cancelled = true;
  }

  public ParsingResult call() throws Exception
  {
    return run();
  }

  // Inner class
  class CancellableHandler<V> implements MatchHandler<V>
  {

    MatchHandler<V> handler;

    public CancellableHandler(MatchHandler<V> handler)
    {
      this.handler = handler;
    }

    @Override
    public boolean match(MatcherContext<V> mc)
    {
      if (cancelled)
      {
        throw new ParserCancelledError();
      }
      boolean b = handler.match(mc);

      return b;
    }

    @Override
    public boolean matchRoot(MatcherContext<V> mc)
    {
      return handler.matchRoot(mc);
    }
  }
}
