package pack1

import java.util.*


fun main()
{
   var scan=Scanner(System.`in`);

    var fNum:Int;
    var sNum:Int;
    var sum:Int;

    var n=263536;
    var count:Int=0;
    while (n>0)
    {
        count++;
        n=n/10;
    }
    println("Number of digit=:"+count);

//    println("Enter the first Number");
//    fNum=scan.nextInt();
//    println("Enter the second Number")
//    sNum=scan.nextInt();
//
//   var data=if(fNum>sNum)fNum else sNum
//
//    println("The greater Number is=:${data} ")

//    println("Enter the days Number")
//    var day=scan.nextInt()
//   var dayIn= when(day)
//    {
//        1->"Monday"
//        2->"Teusday"
//        3->"Wednesday"
//        in 4..10->"Thursday"
//        else->"Invalid";
//    }
//    println("Day is=:${dayIn}")
//    var i:Int=0;
//
//    for (i in 10 downTo  1 step 2)
//    {
//        println("Value=:${i}")
//
//    }


}