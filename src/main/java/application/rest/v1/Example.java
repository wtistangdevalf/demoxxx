package application.rest.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("hello")
public class Example {


    @GET
    public String greet() throws Exception {      
        return "Hello from " + java.net.InetAddress.getLocalHost().getHostName();
    }


}
