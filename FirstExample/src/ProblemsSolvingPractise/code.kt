package ProblemsSolvingPractise

import java.util.*

class Code
{
    var scan=Scanner(System.`in`);
    var name:String?=null
    fun i18()
    {
        println("Enter a String")
        name=scan.next();
        if (name?.length!! >10)
        {
                println("${name!![0]}${name!!.length-2}${name!![name!!.length-1]}");
        }

    }

}
fun main()
{
    var c1=Code();
    c1.i18()

}