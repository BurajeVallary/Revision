import kotlin.math.PI

fun main() {
     printname("Vallary")
    value(22)
    num("0758797430")
    greet("Mike")
    fact("Vallary",24)
  greeting("Jayden")
   statement("Lavin")
    volumeOfCube(3)
    volumeOfCylinder(2.9,3.2,)
}
fun printname (name:String){
    println(name)

}
fun value (age:Int){
    println(age)
}
fun num (phoneNumber:String){
    println(phoneNumber)
}
fun greet (name: String){
    println("Hello $name")
}
fun fact (name: String,age: Int){
    println("my name is $name and I am $age years old")
}
fun greeting (name: String):String{
    return (name)
}
fun statement(name: String):String{
    return("Hello $name how are you doing?")
}
fun volumeOfCube(side:Int){
    println(side*side*side)

}
fun volumeOfCylinder(radius:Double,height:Double){
    println(PI*radius*radius*height)
}
