package Pack2
import java.util.*;
class FirstKotlin {
    var scan=Scanner(System.`in`)
    var arr=Array<Int>(5){0}
    fun bubble()
    {
        println("Enter Array Element")
        for (i in 0..arr.size-1)
        {
            arr[i]=scan.nextInt()
        }
//        println("Entered Element=:")
//        for (i in 0..arr.size-1)
//        {
//            println(arr[i])
//        }
//        for (i in 0..arr.size-1) {
//            for (j in 0..arr.size -1-i) {
//                if (arr[j] > arr[j+1]) {
//                    var temp = arr[j]
//                    arr[j] = arr[j + 1]
//                    arr[j + 1] = temp
//                }
//            }
//        }
        println(arr.sort())
        println(arr.joinToString())
        println("Data After Sorted=:")
        for (i in 0..arr.size-1)
        {
//            println(arr[i])
        }
    }
}
fun main()
{
    var k1=FirstKotlin();
    k1.bubble()

}