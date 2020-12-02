package repository;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class CjDarclPojo {
    private String name;
    private  String address;
    private String designation;


    public CjDarclPojo(){

    }
    public CjDarclPojo(String name, String address, String designation) {
        this.name = name;
        this.address = address;
        this.designation = designation;
        System.out.println("Fron Pojo class=:"+name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

