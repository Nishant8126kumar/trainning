import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI
import resource.CjDarclResource
import javax.ws.rs.core.UriBuilder

fun main() {
    serverStart()
}
fun serverStart()
{
    var resourceConfig=ResourceConfig().register(CjDarclResource::class.java);
    GrizzlyHttpServerFactory.createHttpServer(getUri(),resourceConfig);
}
fun getUri():URI
{
    return UriBuilder.fromUri("http://localhost").port(1233).build();
}