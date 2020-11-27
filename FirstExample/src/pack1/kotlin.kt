package pack1

import java.util.*

fun main()
{
    var mutableList= mutableListOf<Int>()
    var map= mapOf(1 to "Aman",2 to "Aditya")
    var arr= arrayListOf(5,4,3,2,1)

    //val doubled = List(4, { it * 3 })
    var scan=Scanner(System.`in`)
//    println("Enter Length=:")
//    var size=scan.nextInt();
    arr.sort()
//    for (i in 0..size)
//    {
//        arr.add(scan.nextInt())
//    }
    var iterator=arr.iterator()
    while (iterator.hasNext())
    {
        println(iterator.next())
    }
    var data:Int?=10;
    fun getDaata()
    {
        println("The value of Data=:"+data)
        data=null
        println("The update value of=:"+data)

    }

}