import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Repository {

    MongoClient mongoClient=null;
    MongoDatabase mongoDatabase=null;
//    Logger log=Logger.getLogger(String.valueOf(Repository.class));
    public Repository()
    {
        mongoClient=new MongoClient("localhost",27017);
        mongoDatabase= mongoClient.getDatabase("EmployeeDetails");
    }
    public Response getRecord()throws Exception
    {
        List<Document> list=new ArrayList<>();
        BasicDBObject dbQuer=new BasicDBObject();
        dbQuer.put("Name","Rahul Bansal");
        MongoCollection mongoCollection=mongoDatabase.getCollection("Fretron");
        MongoCursor cursor=mongoCollection.find().projection(Projections.excludeId()).iterator();

//        String json = new ObjectMapper().writeValueAsString(result);
//        return Response.ok(json, MediaType.APPLICATION_JSON).build();


        while (cursor.hasNext())
        {
          list.add((Document) cursor.next());
            POJO pojo=new POJO();
            pojo.setAddress(String.valueOf(cursor.next()));

//            list.add(new POJO((DBObject)cursor.next()));
//            list.add(pojo);
        }
        String json= new ObjectMapper().writeValueAsString(list);
       return Response.ok(json, MediaType.APPLICATION_JSON).build();
//        return json;
    }
    public Response getDataUser(String name)throws Exception
    {
        List list=new ArrayList<Document>();
        MongoCollection mongoCollection=mongoDatabase.getCollection("Fretron");
        BasicDBObject dbQuer=new BasicDBObject();
        dbQuer.put("Name",String.valueOf(name));
        FindIterable <Document> findIterable=mongoCollection.find(dbQuer).projection(Projections.excludeId());

        Iterator<Document> iterator=findIterable.iterator();
        while (iterator.hasNext())
        {
            list.add(iterator.next());
//            System.out.println("Data=:"+iterator.next());
        }
        String json=new ObjectMapper().writeValueAsString(list);
        return Response.ok(json,MediaType.APPLICATION_JSON).build();

    }
}
