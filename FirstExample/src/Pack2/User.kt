package Pack2

import java.util.*

class User {
    var scan=Scanner(System.`in`);

    var age=0
    var name=""
    fun getData()
    {
        println("Enter the Name of elmployee");
        name=scan.nextLine();
        print("Enter The age of elmployee")
        age=scan.nextInt()
        var ageFix=calcuAge(age)
        var iterator=ageFix.iterator()
        for (i in ageFix.keys)
        {
            println("$i =: ${ageFix.get(i)}")
        }

    }
    fun calcuAge(age:Int):Map<String,String>
    {
        var map= mutableMapOf<String,String>()
        if (age>25)
        {
            println("Enter Name of Elmloyee")
            map.put("Name", readLine()!!)
            print("Enter Department of employee")
            map.put("Department",scan.next())
            println("Enter The Company Of employee")
            map.put("Company",scan.next())
            return map
        }
        else{
            return map;
        }

    }
}
fun main()
{
    var v1 =User()
    v1.getData()


}