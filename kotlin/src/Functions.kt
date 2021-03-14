fun main() {
    fun forceChoke()
    {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()


    fun makeAnEnterance (line: String)
    {
        println(line)
    }
    makeAnEnterance("I find your lack of faith disturbing")

    fun calculateNumberGoodGuys( rebels: Int, ewoks: Int): Int
    {
        val goodGuys = ewoks+rebels
        return goodGuys
    }
    val rebels = calculateNumberGoodGuys(rebels = 13,ewoks = 15)
    println("There is ${calculateNumberGoodGuys(30,50)} good guys around him")
    println("Darth Vader faced off against $rebels rebel scum")

    fun vaderIsFeeling(mood: String = ("angry"))
    {
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling(mood = "meh")





}