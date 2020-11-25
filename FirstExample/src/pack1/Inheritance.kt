package pack1

import com.sun.jdi.event.StepEvent

open class Inheritance(id:Int,name:String) {
    init {
        println("Id=:$id")
        println("Name=:$name")
    }
}
class Second(id:Int,name:String,salary:Float):Inheritance(id, name)
{
  init {
      println("Salary=:$salary")
  }
}
fun main()
{
    var s1=Second(10,"Nishant",1000.20f);
//    s1.getData();
//    s1.getData()

}
