//Parent class/super class/base class
open class Animal {
    var gender = "Female"
    var age = "2"
    var hasfeathers = true

    fun sound() {
        println("Animal is speaking")
    }
}
open class Duck:Animal() {
    fun movement() {
        println("Duck is swimming")
        }
    }
class Bird:Duck() {
    var hasscales = true
    fun move() {
        println("Bird is flying")

    }
}

fun main() {
    var a = Animal()


    var b = Duck()
    println(b.hasfeathers)
    println(b.gender)

    var c = Bird()
    println(c.hasscales)
    println(c.gender)
}












