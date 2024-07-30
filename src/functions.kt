fun main() {
    //Predefined function
    println("emobilis")

    var squareroot = Math.sqrt(81.0)
    println("The squareroot is $squareroot")

    var round = Math.round(32.67)
    println("The result is $round")

    var myceil = Math.ceil(45.25)
    println("THe output value is my $myceil")

    day()
    add()
    student("Chris",19)
    student("Tamika",5)



}

//User defined functions
fun day(){
    println("Today is Tuesday")
}

fun add(){
    var num1 = 56
    var num2 = 100

    println(num2 + num1)

}

//Parameters and Arguments
fun student(name:String, age:Int){
    println("$name is $age years old")
}