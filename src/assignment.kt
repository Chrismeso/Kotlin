import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter letter")
    val letter = readln()


    if(letter!=null && letter.length==1 && letter[0].isLetter()){
        when(letter){
            "a","e","i","o","u" -> println("$letter is a vowel")
            else -> println("$letter is a consonant")

       }
    }
    else {
        println("Enter valid input")
    }
}







