package Collection

import java.util.*

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
}
fun main()
{
    var k1=CollectionInKotlin();
    k1.getArray()
}