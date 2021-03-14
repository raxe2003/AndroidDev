fun main() {

    var name: String = "JonnyB"
//    name = null
//    !!
    var nullableName: String? = "Do I really exist"
    nullableName = null
    //Null Check
    var lenght = 0
    if (nullableName != null)
    {
        println(nullableName.length)

    }else
    {
        lenght = -1
    }
    println(lenght)

    val l = if (nullableName != null) nullableName.length else -1

    //Safe Call Operator

    println(nullableName?.length)

    //Elvis Operator

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    //!!


}