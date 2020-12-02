package repository

//import javax.swing.text.Document
import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import com.mongodb.MongoClient
import com.mongodb.util.JSON
import org.bson.Document
import org.codehaus.jackson.map.ObjectMapper

class CjDarclRepository {
    var mongoClient: MongoClient? = null;
    var objectMapper: ObjectMapper? = null;
    var document: Document? = null;

    constructor() {
        mongoClient = MongoClient("localhost", 27017)
    }

    fun getAllRecord(): List<CjDarclPojo> {
        var empRecord = mutableListOf<CjDarclPojo>()
        print("Welcome From Repository")
        var mongoDatabase = mongoClient?.getDatabase("EmployeeDetails");
        var mongoCollection = mongoDatabase?.getCollection("employess")
        var mongoCursor = mongoCollection?.find()?.iterator();
        while (mongoCursor!!.hasNext()) {
            try {
                var doc = Document()
                doc = mongoCursor?.next();
                doc.remove("_id");
                var json = JSON.serialize(doc)
                var cjDarclPojo=CjDarclPojo();
                objectMapper=ObjectMapper();
                cjDarclPojo = objectMapper?.readValue(json, CjDarclPojo::class.java)!!
                cjDarclPojo?.let { empRecord?.add(it) }
            } catch (e: Exception) {
                print(e.printStackTrace())
            }
        }
        return empRecord;
    }
    fun getRecordByName(name:String):List<CjDarclPojo>
    {
        println("Reached in Repository=:"+name);
        var empRecord= mutableListOf<CjDarclPojo>()
        var mongoDatabase=mongoClient?.getDatabase("EmployeeDetails");
        var mongoCollection=mongoDatabase?.getCollection("employess")
        var basicDBObject=BasicDBObject();
        basicDBObject.put("name",name)
        var mongoCursor=mongoCollection?.find(basicDBObject)?.iterator()
        while (mongoCursor!!.hasNext())
        {
            var doc=Document();
            doc=mongoCursor.next();
            doc.remove("_id");
            var json=JSON.serialize(doc)
            var cjDarclPojo=CjDarclPojo();
            objectMapper= ObjectMapper();
            cjDarclPojo=objectMapper?.readValue(json,CjDarclPojo::class.java)!!;
            cjDarclPojo?.let { empRecord?.add(cjDarclPojo) }
        }
        return empRecord;
    }
    fun insertUserInfomation(userData:CjDarclPojo)
    {
        println("data reached=:"+userData);
        var mongoDatabase=mongoClient?.getDatabase("EmployeeDetails")
        var mongoCollection=mongoDatabase?.getCollection("employess")
        var doc=Document.parse(userData.toString())
        var mongoCursor=mongoCollection?.insertOne(doc)
        println(mongoCursor)
    }
}