import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import resource.TestResource
import javax.ws.rs.core.UriBuilder

//lets create a server
fun main() {
    var baseURI = UriBuilder.fromUri("http://localhost").port(8080).build()
   var resource_config = ResourceConfig(TestResource::class.java)
   var server = GrizzlyHttpServerFactory.createHttpServer(baseURI,resource_config,false)
    try{
        server.start()
    }
    catch (e:Exception){
        println(e)
    }


}