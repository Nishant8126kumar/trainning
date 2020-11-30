import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI
import javax.ws.rs.core.UriBuilder

fun main() {
    serverStart()
}
fun serverStart()
{
    var resourceConfig=ResourceConfig(MyResource.class)
    GrizzlyHttpServerFactory.createHttpServer(getUri(),resourceConfig);

}
fun getUri():URI
{
    return UriBuilder.fromUri("http:/localhost").port(1990).build();
}