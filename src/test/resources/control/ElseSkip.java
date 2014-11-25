package control;

import io.vertx.core.AbstractVerticle;
import io.vertx.codetrans.annotations.CodeTranslate;
import io.vertx.codetrans.ControlTest;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ElseSkip extends AbstractVerticle {

  @Override
  @CodeTranslate
  public void start() throws Exception {
    if (true) {
    } else {
      ControlTest.o = "ok";
    }
  }
}