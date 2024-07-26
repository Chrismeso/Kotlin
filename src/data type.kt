fun main() {
    var number: Int = 67 //integer
    var num: Float = 4.12F //float
    var mydecimal: Double = 45.67 //double
    var alphabet:Char = 'C' //character
    var greeting: String = "Hello there" //string
    var isKotlinInteresting: Boolean = true //boolean

    var result:Int
    result = 500
    println(result)

    println(number)
    println(num)
    println(mydecimal)
    println(alphabet)
    println(greeting)
    println(isKotlinInteresting)


    //Type casting
    var result1 = number.toDouble()
    println(result1)

    var output = mydecimal.toInt()
    println(output)
}