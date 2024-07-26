fun main() {
    var languages = arrayOf("Kotlin", "Python", "java")

    println(languages[1])

    //Reassigning ana element in ana array

    languages[1] = "C++"
    println(languages[1])

    //Adding an element in an array
    var all = languages.plus("php")
    for (lang in all){
        println(lang)
    }

    //Size of an array
    println(all.size)

}