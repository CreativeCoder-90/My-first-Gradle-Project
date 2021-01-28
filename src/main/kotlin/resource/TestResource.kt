package resource

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/users/v1")
class TestResource {


    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    fun getStatus() : Response {
      return Response.status(200).entity("Running").build()
    }
}


