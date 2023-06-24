class Song constructor(var title:String, var artist:String){
    //in this class I demonstrate object-oriented programming in
    //Kotlin
    init {
        println("This is code from a primary constructor")
    }



}

fun main() {
    var midnights = Song("Midnights", "Taylor Swift")
    println("The song ${midnights.title} was performed by ${midnights.artist} ")
}

//Secondary Constructors

