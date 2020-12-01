import com.mongodb.DBObject;
import org.bson.Document;

public class POJO {
    String name;
    String address;
    String designation;


    public POJO(String name, String address, String designation) {
        this.name = name;
        this.address = address;
        this.designation = designation;
    }

    public POJO(DBObject next) {
    }

    public POJO() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
