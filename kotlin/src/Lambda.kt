fun main() {
    val printMessage = {message: String -> println(message)}

    printMessage("Hello World")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    val sumB : (Int, Int)-> Int = {x , y -> x + y}

    fun downloadData(url: String, complition: ()-> Unit)
    {
        //sent a download request
        //we got back data
        //there were no network errors
        complition()
    }
    //call downloadDataFunction

    downloadData(url = "fakeUrl.com") {
        println(
            "The code in this block will only run" +
                    "after the completion()"
        )
    }

    fun downloadCarData(url: String, complition: (Car)->Unit)
    {
        //send a download request
        //we got back car data
        val car = Car(make = "Tesla",model = "ModelX",collor = "blue")
        complition(car)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.collor)
        println(car.make)
    }

    downloadCarData("fakeUrl.com"){
        println(it.collor)
        println(it.make)

    }

    fun downloadTruckData(url: String, complition: (Truck?,Boolean) -> Unit)
    {
        //make the web request
        //we get the results back
        val webRequestSuccess = true
        if (webRequestSuccess)
        {
            //recived truck data
            val truck = Truck(model = "Ford",make = "F-150",towingCapacity = 1000)
            complition (truck, true)
        }else
        {
            complition(null, false)
        }
    }

    downloadTruckData(url = "fakeUrl.com") { truck, success ->
        if (success == true)
        {
            //do something with truck
            truck?.tow()
        }
        else
        {
            //handle the web request failure
            println("Something went wrong")
        }

    }

}