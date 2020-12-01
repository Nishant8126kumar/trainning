package service;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;
import repository.EmpBean;
import repository.EmpRepository;

import java.util.List;

public class EmpService {
    EmpRepository empRepository=null;
    ObjectMapper mapper=new ObjectMapper();
    public EmpService()
    {
        empRepository=new EmpRepository();
    }
    public List<EmpBean> getAllEmpRecord()throws Exception
    {
        return empRepository.getAllEmployeeRecord();
    }
    public List<EmpBean> getSpecificUser(String name)throws Exception
    {
        return empRepository.getUserByName(name);
    }
}
