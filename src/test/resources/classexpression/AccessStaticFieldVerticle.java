package classexpression;

import io.vertx.core.AbstractVerticle;
import io.vertx.codetrans.ClassExpressionTest;
import io.vertx.codetrans.annotations.CodeTranslate;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class AccessStaticFieldVerticle extends AbstractVerticle {

  @Override
  @CodeTranslate
  public void start() throws Exception {
    ClassExpressionTest.field = "foo";
  }
}