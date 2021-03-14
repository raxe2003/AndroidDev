fun main() {
    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder", "BobaFett" to "Rocket Pack")

    for (person in rebels)
    {
        println("Name: $person")
    }

    for((key,value)in rebelVehicles)
    {
        println("$key gets around in their $value")
    }

    var x = 0

    while (x <= 10)
    {
        println(x)
        x++
    }

}