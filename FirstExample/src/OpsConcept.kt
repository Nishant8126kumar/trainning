import java.util.*
class OpsConcept {
    var id:Int=0
    var name:String=""
    var scac=Scanner(System.`in`)
    fun  getData()
    {
        println("Enter the Id Of Emoloyee");
        id=scac.nextInt();
        println("Enter the Name Of Employee")
        name=scac.next( );
    }



}
fun main()
{
    var a1=OpsConcept();
    a1.getData();

}