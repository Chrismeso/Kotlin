class dog(var name:String, var breed:String, var age:Int){


}

fun main() {
    var dog1=dog("Tito","German Shephered",6)

    println(dog1.name + " " + dog1.breed + " " + dog1.age)

    var dog2=dog("Bob","Pitbull",7 )

    println(dog2.name + " " + dog2.breed + " " + dog2.age)

    var dog3=dog("Ann","Siberian husky",3)

    println(dog3.name + " " + dog3.breed + " " + dog3.age)
}