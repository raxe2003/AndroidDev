//class Car constructor(val make: String, val model: String, var collor: String )
//{
//   fun accelerate()
//   {
//       println("vroom vroom")
//   }
//
//    fun details()
//    {
//        println(" This is a $collor $make $model")
//    }
//
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int)
//{
//    fun tow()
//    {
//        println("taking the horses to the rodeo")
//    }
//
//    fun details ()
//    {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}
open class Vehicle(val make: String, val model: String)
{
    open fun accelerate()
    {
        println("vroom vroom")
    }
    fun park()
    {
        println("parking the vehicle")
    }
    fun brake()
    {
        println("STOP")
    }

}


class Car(make: String,model: String, var collor: String) : Vehicle(make,model)
{
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }

}

class Truck(make: String,model: String, val towingCapacity: Int) : Vehicle(make,model)
{
    fun tow()
    {
        println("headed out to the mountains")
    }
}


fun main() {

    val tesla = Car ("Tesla", "Model S","red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150",1000)
    truck.tow()

    //    var car = Car(make = "Fiat",model = "Croma","Black")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//
//    val truck = Truck("Ford", "F-150",1000)
//    truck.tow()
//    car.details()
//    truck.details()

}

