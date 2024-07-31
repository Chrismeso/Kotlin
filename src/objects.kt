class person{
    // variablss are either properties/attributes/Characteristics
    var name = "John"
    var age = "34"

    //Behaviour/Method/Function
    fun sound(){
        println("Person is speaking")
    }
}
// objects(craeting objects outside of a class)
fun main() {
    var teacher = person()
    println(teacher.age)
    println(teacher.name)
    teacher.sound()

    var student = person()
    var accountant = person()
}