import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


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
    public List<Document> getRecord()
    {
        List<Document> list=new ArrayList<>();
        MongoCollection mongoCollection=mongoDatabase.getCollection("Fretron");
        FindIterable<Document> findIterable=mongoCollection.find();
        Iterator <Document> iterator=findIterable.iterator();

        while (iterator.hasNext())
        {
            list.add(iterator.next());
        }
        return list;
    }
    public List<Document> getDataUser(String name)
    {
        List list=new ArrayList<Document>();
        MongoCollection mongoCollection=mongoDatabase.getCollection("Fretron");
        BasicDBObject dbQuer=new BasicDBObject();
        dbQuer.put("Name",String.valueOf(name));
        FindIterable <Document> findIterable=mongoCollection.find(dbQuer);

        Iterator<Document> iterator=findIterable.iterator();
        while (iterator.hasNext())
        {
            list.add(iterator.next());
//            System.out.println("Data=:"+iterator.next());
        }
        return list;
    }
}
