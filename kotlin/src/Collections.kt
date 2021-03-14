fun main() {

    val imperials = listOf("Emperor","Darth Vader","Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("false"))
    println(imperials)


    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    rebels.add(1,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah","This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder", "BobaFett" to "Rocket Pack")
    rebelVehicles["Luke"] = "Xwing"
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)

    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())


}