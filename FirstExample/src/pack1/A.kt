import  java.util.*;
class A
{

    var id:Int=10;
    var name:String=""
    var scan=Scanner(System.`in`);
    fun getData()
    {
        println("Enter the Id of Employee")
        id=scan.nextInt() ;
//        println("Enter the Name Of Employee");
//        name=scan.next()
    }
    fun display(name:String)
    {
        println("ID of Employee=:$id")
        println("Name of Employe=$name");
    }
}

fun main(args:Array<String>)
{
    var scan=Scanner(System.`in`);
//    var a1=A()
//    a1.getData()
//    a1.display("Nishant")

//    var arr:IntArray= intArrayOf(1,2,3,4,5);
//    for (i in 0..arr.size-1)
//    {
//        println(arr[i])
//    }
//   / println(arr.get(3))
//    var arr=Array<Int>(5){0};
//    for (i in 0..arr.size-1)
//    {
//        arr[i]=scan.nextInt()
//    }
//    println(arr[3])
//    var a= buildString { "java" }
//    var b="java"
//    println(a===b)

    var a:Int=10;
    var b=10.9

    var str:Any="java"

    var str2:String?=null

    var p=str2?.length?:-1
    println(p)


}