package resource

import org.codehaus.jackson.map.ObjectMapper
import repository.CjDarclPojo
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import services.CjDarclService;
import javax.sound.midi.Track
import javax.ws.rs.*;

@Path("/data")
class CjDarclResource {
    var cjDarclService:CjDarclService?=null;
    var objectMapper:ObjectMapper?=null;
    constructor()
    {
        cjDarclService= CjDarclService();
        objectMapper= ObjectMapper();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN)
    fun getAllRecord():Response
    {
        println("Welcome ")
//        println("MyResouce"+);
        var record= cjDarclService?.getAllEmployeeRecord()
        var json=objectMapper?.writeValueAsString(record);
        return Response.ok(json).build()
    }
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN)
    fun getRecordSpecificUser(@PathParam("name") name:String):Response
    {
        print("The Value from user side=:$name")
        cjDarclService?.getOneRecordByName(name)
        var recod=cjDarclService?.getOneRecordByName(name);
        var json=objectMapper?.writeValueAsString(recod);
//        println("record=:"+recod)
        return Response.ok(json).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN)
    fun userDetails(request:String):String
    {
        var personRecord=objectMapper?.readValue(request,CjDarclPojo::class.java)!!;
//        println("data=:"+personRecord)
        cjDarclService?.postUserDetails(personRecord)
        return "Welcome"

    }
    @PUT
    fun updateEmployeeRecord():String
    {
        return "ok"

    }
    @DELETE
    @Path("/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    fun deleteEmployeeRecord(@PathParam("name") name: String):String
    {
        println("name=:"+name)
        return "Ok"
    }
}