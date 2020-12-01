package repository;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.util.JSON;
import org.bson.Document;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import javax.print.Doc;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpRepository {

    MongoClient mongoClient = null;
    MongoDatabase mongoDatabase = null;
    ObjectMapper mapper = new ObjectMapper();
    public EmpRepository() {
        mongoClient = new MongoClient("localhost", 27017);
        mongoDatabase = mongoClient.getDatabase("EmployeeDetails");
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES ,false);
    }
    public List<EmpBean> getAllEmployeeRecord() throws Exception {
        List<EmpBean> employess = new ArrayList<>();
        MongoCollection mongoCollection = mongoDatabase.getCollection("employess");
        MongoCursor cursor = mongoCollection.find().projection(Projections.excludeId()).iterator();
        while (cursor.hasNext()) {
            try {
                Document doc = (Document) cursor.next();
//                doc.remove("_id");
                String json =  JSON.serialize(doc);
                EmpBean employee = mapper.readValue(json , EmpBean.class);
                employess.add(employee);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return employess;
    }

    public List<EmpBean> getUserByName(String name) throws Exception {
        List<EmpBean> employeess = new ArrayList();
        System.out.println("user information =:"+name);
        MongoCollection mongoCollection = mongoDatabase.getCollection("employess");
        BasicDBObject dbQuer = new BasicDBObject();
        dbQuer.put("name", String.valueOf(name));
        MongoCursor cursor=mongoCollection.find(dbQuer).iterator();
        while (cursor.hasNext()) {
            Document docu=(Document) cursor.next();
            String json=JSON.serialize(docu);
            EmpBean employee=mapper.readValue(json,EmpBean.class);
            employeess.add(employee);
        }
        return employeess;

    }
}
