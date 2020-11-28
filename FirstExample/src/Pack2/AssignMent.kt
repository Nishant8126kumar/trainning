package Pack2

import java.util.*

fun main()
{
    var arr= arrayListOf<Int>()
    var scan=Scanner(System.`in`)
    var value=0;
    var sum=0;
    while (true)
    {

        println("Enter the buy Apple And -1 For Exit")
        value=scan.nextInt()
        if (value==-1)
        {
            break
        }
        else{
            sum=sum+value
            arr.add(value)
        }
    }
    var ram=(sum*50)/100
    var shyam=(sum*30)/100
    var rahim=(sum*20)/100
    println("ram=:$ram")
    println("Shyam=:$shyam")
    println("Rahim=:$rahim")
    println("Sum=:"+sum)
}