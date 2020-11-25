package pack1

import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.math.max
class SecondLargest {
    var arr = Array<Int>(5) { 0 }
    var scan = Scanner(System.`in`);
//    fun getData() {
//        println("Enter Array")
//        for (i in 0..arr.size - 1) {
//            arr[i] = scan.nextInt();
//        }
//        arr.sort()
//        println("Second Largest Number is=:"+arr[arr.size-2])
//
//    }
    fun pair()
    {
        var pair=0
        println("Enter Array Element=:")
        for (i in 0..arr.size-1)
        {
            arr[i]=scan.nextInt()
        }
        println("Enter the Number For Pair")
        pair=scan.nextInt();
        for (i in 0..arr.size-1)
        {
            for (j in i+1..arr.size-1) {
                if ((arr[i] + arr[j]) == pair) {
                    println("ok")
                    print("(${arr[i]},${arr[j]})")
                }
            }
        }

    }
}
fun main()
{
    var a1=SecondLargest();
    a1.pair()

}