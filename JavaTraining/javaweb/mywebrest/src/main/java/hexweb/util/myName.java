package hexweb.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.Response;

//..../rest/myname?username=Mayuresh
// @QueryParam("namekey") String namevalue

@Path("/myname")
public class myName{

    @GET
    @Produces("text/html")
    public Response displayMyName(
        @QueryParam("username") String uname){

        String str = "My name is "+ uname;
        return Response.status(200).entity(str).build();
    }
}