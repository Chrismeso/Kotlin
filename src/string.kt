// its a collection of characters
fun main() {
    var firstname = "Chris"
    var lastname = "eMobilis"


    println(firstname)

    //Accessing an element in a string
    println(lastname)
    println(firstname[1])

    //Modifying ana element
    println(lastname.uppercase())
    println(firstname.lowercase())

    //string concatenation - Joining strings
    println(firstname + lastname)
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //string interpolation
    println("My firstname is $firstname")

    var num1 = 67
    var num2 = 20
    println("THe sum of $num1 and $num2 is " + (num1+num2))

}