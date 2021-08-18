package app;

import io.jooby.annotations.*;


public class Controller {
  @Path("/")
  @GET
  public String sayHi() {
    return "Calculadora API!";
  }
}
