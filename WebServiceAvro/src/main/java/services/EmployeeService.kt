 package services

 import repository.EmployeeRepository
 import repository.Employees

 class EmployeeService {
     var employeerepository=EmployeeRepository();

     fun fretronAllEmpRecord(): List<Employees>? {

         return employeerepository?.getAllFretronEmpRecord()!!
     }

     fun getOneRecordEmp(name: String):List<Employees> {
         println("In Service=:" + name)
         return employeerepository?.getRecordByName(name);
     }
     fun newEmployeeRecord(record: Employees)
     {
 //        println("Data Reached=:"+record)
         employeerepository.insertEmployeeRecord(record)

     }
     fun deletRecordByuuid(uuid:String)
     {
         employeerepository.deletRecord(uuid)

     }
 }



