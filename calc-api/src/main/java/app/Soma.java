package app;
import io.jooby.annotations.*;

public class Soma{

    @Path("/soma/{}/{}")
    @GET
    public String rotaSoma(){
        return "soma";
    }
}