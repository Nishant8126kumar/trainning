package Collection

import java.util.*
import java.util.Map
import kotlin.collections.ArrayList

class CollectionInKotlin {
    var scan=Scanner(System.`in`)

    var size=0;

    fun getArray()
    {
        println("Enter the size of Array")
        size=scan.nextInt()
        var arr=IntArray(size)
        println("Enter Array Element")
        println("Welcome")
        for (i in 0 until  arr.size-1)
        {
            arr[i]=scan.nextInt()
        }
        println("Length of Array=:"+arr.size)
        println("Your Enterd Data")
        for (i in 0 until arr.size-1)
        {
            println(arr[i])
        }
    }
    fun list()
    {
      var list= mutableListOf<Int>(1,2,3,4,5)
//        var mutableListInt: MutableList<Int> = mutableListOf<Int>()
        var set:MutableSet<Int> = mutableSetOf(1,2,3,4,5)


        var iterator=list.iterator()

        while (iterator.hasNext())
        {
            println(iterator.next())
        }

    }
    fun set()
    {
//        var set= setOf<Int>(1,2,2,3,4,5,6,7)
//        for (i in set)
//        {
//            println(i)
//        }
        var set= mutableSetOf<Int>()

        println("Enter the Length of Data")
        var size=scan.nextInt()
        for (i in 0..size)
        {
            set.add(scan.nextInt())
        }
        println(set)
    }
    fun arrayList()
    {
        var arr= arrayListOf<Int>(1,2,3,4,5);
        var arr2= arrayListOf<Int>(1,2,3,4,6)
    }
    fun map()
    {
        var map= mutableMapOf<Int,String>(1 to "Aman",2 to "Shivam");
        var map2= mapOf<Int,String>()

//        var map2:kotlin.collections.Map<Int,String> = mapOf(1 to "Shiva")

        map.set(3,"Vivek")

//        println(map.get(2))
//        map.put()
        for (i in map.keys)
        {
            println(map[i])
        }
    }
}
fun main()
{
    var k1=CollectionInKotlin();
//    k1.getArray()
//    k1.set()
    k1.map()
}