import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import resource.EmployeeResource
import java.net.URI
import javax.ws.rs.core.UriBuilder

fun main()
{
    serverStart();
}
fun serverStart()
{
    var resourceConfig= ResourceConfig().register(EmployeeResource::class.java)
    GrizzlyHttpServerFactory.createHttpServer(getUri(),resourceConfig);
}
fun getUri(): URI
{
    return UriBuilder.fromUri("http://localhost").port(2010).build()
}
