 package repository

 import com.mongodb.BasicDBObject
 import com.mongodb.MongoClient
 import com.mongodb.client.MongoDatabase
 import com.mongodb.util.JSON
 import org.bson.Document
 import org.codehaus.jackson.map.ObjectMapper
 import java.util.*
 import java.util.logging.Filter

 class EmployeeRepository{
     var mongoClient: MongoClient?=null
     var objectMapper=ObjectMapper()
     var mongoDatabase:MongoDatabase?=null//
     constructor()
     {
         mongoClient= MongoClient("localhost",27017)
         mongoDatabase=mongoClient?.getDatabase("EmployeeDetails")
     }
     fun getAllFretronEmpRecord():List<Employees>
     {
         var empRecord= mutableListOf<Employees>()
 //        var mongoDatabase=mongoClient?.getDatabase("EmployeeDetails")
         var mongoCollection=mongoDatabase?.getCollection("employess")
         var mongoCursor=mongoCollection?.find()?.iterator();
         while (mongoCursor!!.hasNext())
         {
             try {
                 var doc=Document();
                 doc=mongoCursor.next()
                 doc.remove("_id")
                 var json=JSON.serialize(doc)
                 var employees=Employees()
                 employees=objectMapper.readValue(json,Employees::class.java)!!
                 employees?.let { empRecord?.add(it) }
             } catch (e: Exception) {
                 println("Exception=:"+e)
             }
         }
         return empRecord
     }
     fun getRecordByName(name:String):List<Employees>
     {

         var record= mutableListOf<Employees>()
 //        var mongoDatabase=mongoClient?.getDatabase("EmployeeDetails")
         var mongoCollection=mongoDatabase?.getCollection("employess")
         var basicDBObject= BasicDBObject()
         basicDBObject.put("name",name)
         var mongoCursor=mongoCollection?.find(basicDBObject)?.iterator()
         while (mongoCursor!!.hasNext())
         {
             try {
                 var doc= Document()
                 doc = mongoCursor?.next()
                 doc.remove("_id")
                 var employees=Employees()
                 var json=JSON.serialize(doc)
                 employees=objectMapper.readValue(json,Employees::class.java)
                 employees?.let { record.add(it) }

             } catch (e: Exception) {
                 println("Exception=:"+e)
             }
         }
         println("record Data=: $record")
         return record
     }
     fun insertEmployeeRecord(record: Employees)
     {
         try {
             println("Data Co=:$record")
//             var mongoDatabase=mongoClient?.getDatabase("EmployeeDetails")
             var mongoCollection=mongoDatabase?.getCollection("employess")
             var doc=Document.parse(record.toString())
             doc.set("uuid",getUUid().toString())
             var mongoCursor=mongoCollection?.insertOne(doc)
             println("details=:"+mongoCursor)
         } catch (e: Exception) {
             println("Exception cooured=:"+e)
         }
     }
     fun deletRecord(uuid:String)
     {
         try {
             println("From Repository=:"+uuid)
             var basicDBObject=BasicDBObject();
             basicDBObject.put("uuid",uuid)
             var mongoCollection=mongoDatabase?.getCollection("employess")
             var mongoCursor=mongoCollection?.deleteOne(basicDBObject)
         } catch (e: Exception) {
             println("Exception=:$e")
         }
     }
     fun getUUid(): UUID {
         var id=UUID.randomUUID()
         println(id);
         return id;
     }
 }
 //fun main()
 //{
 //    var e=EmployeeRepository();com
 //    e.getUUid();
 ////   print( e.getNewUserId());
 //   var uuid= UUID.randomUUID();
 //    println(uuid)
 //}
