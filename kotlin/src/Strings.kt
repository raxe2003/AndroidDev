fun main(args: Array<String>)
{
    val str = "May the force be with you."
    println(str)

    val str1 = "My dad said the finniest thing he said \"A Joke\" "

    val rawCrawl = """A long tome ago,
        |in the galaxy
        |far,far,away...
        |BUMM BUMM BUMMMM....""".trimMargin()
    println(rawCrawl)


//    for (char in str )
//    {
//        println(char)
//    }


    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", true )
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subSequence = str.subSequence(4,13)
    println(subSequence)

    val luke = "Luke Skywalker"
    val lightSaberCollor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberCollor lightsaber and drives $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters")

    

}
