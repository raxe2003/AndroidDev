fun main() {

    val a = 3
    val b = 2

    if (a==b)
    {
        println("a = b")
    }else if(a > b)
    {
        println("a>b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price)
    {
        println("You can buy this")

    }else
    {
        println("You cant buy this. You don't have money to buy this")
    }

    val degrees = 20

    if (degrees >= 70)
    {
        println("This is some weather")
    }else if (degrees<70 && degrees >= 50)
    {
        println("Grab a sweater")
    }else
    {
        println("Holy crap it's cold")
    }

    // ==
    // !=
    // >
    // <
    // >=
    // <=


    val isHungry = true
    val isBored  = true
     if (isHungry == true || isBored == true )
     {
         println("Let's get pizza")
     }

    val x = 3

    when (x)
    {
        1 -> println("x = 1")
        2 -> println("x = 2")
        else -> println("x does not equal 1 or 2")
    }


    fun vaderIsFeeling(mood: String = "angry")
    {
        if (mood == "angry")
        {
            println("run for the hills, Vader is $mood")
        }else
        {
            println("Whatever you do don't make him angry")
        }
    }
    vaderIsFeeling(mood = "angry")



}