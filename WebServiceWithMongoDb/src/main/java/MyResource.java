import org.bson.Document;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Path("/api")
public class MyResource {
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
    Repository repository=new Repository();
    Response response=null;
    JSONObject jsonObject=null;

    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
    public String get()
    {
        System.out.println("Data=:"+repository.getRecord());
        return repository.getRecord().toString();
    }
//    @GET
//    @Path("/print/{name}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String produceJSON( @PathParam("name") String name ) {
//
//
//        return "ok";
//
//    }
    @GET
    @Path("/user/{name}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
    public String getRecordByName( @PathParam("name") String name )
    {
        System.out.println("Name=:"+name);
//        repository.getDataUser(name);
        System.out.println("Data From Repository="+repository.getDataUser(name));
        return repository.getDataUser(name).toString();

    }
}
