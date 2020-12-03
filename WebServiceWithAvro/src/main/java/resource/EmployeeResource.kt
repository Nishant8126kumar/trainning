package resource

import org.codehaus.jackson.map.ObjectMapper
import repository.Employees
import services.EmployeeService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
@Path("/employee")
class EmployeeResource {
    val fretronService = EmployeeService()
    val objectMapper = ObjectMapper()

    @GET
    @Produces(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN)
    fun fretronGetAllRecord(): Response {
        println("Welcome Fretron resource")
        val record = fretronService.fretronAllEmpRecord()
        println("record=:  $record")
        return Response.ok(record.toString()).build()
    }

    @GET
    @Path("/{name}")
    @Consumes(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN)
    fun fretronGetOneRecordByUserName(@PathParam("name") name: String): Response {
        fretronService.getOneRecordEmp(name)
        var record=fretronService.getOneRecordEmp(name);
        return Response.ok(record.toString()).build()
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML)
    fun registerEmployeeRecord(request:String):String
    {
        var empRecord=objectMapper.readValue<Employees>(request,Employees::class.java)
//        println("Record=:$empRecord")
        fretronService.newEmployeeRecord(empRecord);
        return "ok";
    }

}