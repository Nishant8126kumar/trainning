package services
import repository.CjDarclPojo
import repository.CjDarclRepository;
class CjDarclService
{
    var cjDarclRepository:CjDarclRepository?=null;
    constructor()
    {
        cjDarclRepository= CjDarclRepository()
    }
    fun getAllEmployeeRecord():List<CjDarclPojo>
    {
           return cjDarclRepository?.getAllRecord()!!;
    }
    fun getOneRecordByName(name:String):List<CjDarclPojo>
    {
          return cjDarclRepository?.getRecordByName(name)!!
    }
    fun postUserDetails(data:CjDarclPojo)
    {
//        println("data reached in service=:"+data);
        cjDarclRepository?.insertUserInfomation(data);

    }

}
