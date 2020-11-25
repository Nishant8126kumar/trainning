package pack1

open class AC
{
    open fun getData()
    {
        println("From Base Class")
    }
}
class B :AC()
{
   override fun getData()
    {
        super.getData()
        println("From Derived Class")
    }
}
fun main()
    {
    var a1=B();
        a1.getData();
//        var has= setOf<Int>(1,2,3,5,6,7,8,8);
//    for(i in has)
//    {
//        println("Value in set =:"+i)
//    }
//        var map= mapOf<String,Int>("Aman" to 21 , "Naman" to 23);
//        for (i in map.keys)
//        {
//            println("Data=:"+map.get(i))
//        }

}