class Artist {
    var artistName: String? = null
    var artistAge: Int? = null
    var artistSex: Boolean? = null


    //secondary constructor

    constructor(artistName: String, artistAge: Int, artistSex: Boolean){
        this.artistName = artistName
        this.artistAge = artistAge
        this.artistSex = artistSex

    }


}

fun main(args: Array<String>) {
    var obj = Artist("Bryan", 22, true)
    println("The artist name is ${obj.artistName}, he's aged ${obj.artistAge} and sex is ${obj.artistSex}")
}