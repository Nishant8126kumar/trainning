package pack1

import java.util.*

class A
{
    var id:Int = 0
    var name:String = ""
    var scan=Scanner(System.`in`);
    fun getData()
    {
        println("Enter the Id of employee");
        id=scan.nextInt();
        println("Enter the Name of Employee");
        name=scan.nextLine();
    }
    fun display()
    {
        println("Id of employee=:${id}");
        println("Name od employee=:${name}");
    }

    fun main()
    {
        var a= A();
        a.getData();
        a.display();
    }
}