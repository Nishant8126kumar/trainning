import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class MainTestClass {
    public static void main(String args[]) {
        try {
            System.out.println("Server is Starting");
            URI base=(URI) UriBuilder.fromUri("http://localhost/").port(8080).build();
            ResourceConfig config = new ResourceConfig(MyResource.class);
            HttpServer server = GrizzlyHttpServerFactory.createHttpServer(base, config);

        } catch (Exception e) {
            System.out.println("Some Exception Occured" + e.getMessage());
        }
    }

}

