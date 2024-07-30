fun main() {
    //while

    var number = 30
    while(number <= 35){
        println("Number is $number")
        number++
    }

    var num = 10
    while (num >= 5){
        println(num)
        num--
    }
    //Break
    var count = 100
    while (count <= 105){
        println("Count is $count")
        count++

    if (count == 103)
        break
    }

    //continue
    var x = 25
    while (x <= 30){
        if(x == 27){
            x++
            continue
        }
        println(x)
        x++

    }

    //do while loop

    var num2 = 30
    do{
        println(num2)
        num2++

    }
        while (num2<=35)

        // for loop

        for (num3 in 1..5){
            println("Number : $num3")
        }

    for (letter in 'a'..'f'){
        println("Letter is $letter")
    }
    for (z in 20..25){
        if (z == 23){
            break
        }
        println(z)
    }
     for (ournumber in 185..190){
         if (ournumber == 187){
             continue
         }
         println(ournumber)
     }
    for (myletter in 'a'..'d'){
        if (myletter=='b'){
            continue
        }
        println(myletter)
    }







}