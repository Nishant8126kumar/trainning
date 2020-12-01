import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import resource.EmpResource

import java.net.URI

fun main() {
    startServer()
}

fun startServer(): HttpServer? {
    val resourceConfig = ResourceConfig(EmpResource::class.java)
    return GrizzlyHttpServerFactory.createHttpServer(getBaseUrl(), resourceConfig)
}

fun getBaseUrl():URI{
    return javax.ws.rs.core.UriBuilder.fromUri("http://localhost").port(1222).build()
}