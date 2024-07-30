import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number :")
    var num1 = read.nextDouble()

     println("Enter second number :")
    var num2 = read.nextDouble()

    println("Enter operator")
    var operator = read.next().single()

    when(operator){
        '+' -> println(num1+num2)
        '-' -> println(num1-num2)
        '*' -> println(num1 * num2)
        '/' -> println(num1 / num2)
        '%' -> println(num1 % num2)

        else -> println("Invalid operator")
    }





}