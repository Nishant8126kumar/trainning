package resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import repository.EmpBean;
import  repository.EmpRepository;
import service.EmpService;

import java.security.interfaces.RSAKey;
import java.util.List;

@Path("/api")
public class EmpResource {

    EmpService empService=new EmpService();
    Response response=null;
    JSONObject jsonObject=null;
    ObjectMapper mapper=new ObjectMapper();

    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
    public Response get()throws  Exception
    {
        List<EmpBean> employess = empService.getAllEmpRecord();
        String json = mapper.writeValueAsString(employess);
        return Response.ok(json).build();

    }
    @GET
    @Path("/{name}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
    public Response getRecordByName( @PathParam("name") String name )throws  Exception
    {
        System.out.println("Name=:"+name);
        List<EmpBean> employees=empService.getSpecificUser(name);
        String json=mapper.writeValueAsString(employees);
        return Response.ok(json).build();
    }
}
