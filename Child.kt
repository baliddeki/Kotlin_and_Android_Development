class Child: Parent {
    //constructor to pick parent properties
    constructor(parentName: String, parentAge: Int){
        this.parentName = parentName
        this.parentAge = parentAge
    }

    fun superSound(){
        super.animalSound()
    }


    override fun animalSound(){
        println("The child makes a sound of crying")
    }

    //Implementing abstract variables and methods
    override fun showGrand(granny: String): String {
        return granny
    }
    override var grannyAge: Int = 100

}


fun main(args: Array<String>) {
    var childObj = Child("Namikisa Grace", 55)
    childObj.parentDetails()
    childObj.animalSound()
    childObj.superSound()
    println("Your grand parent is ${childObj.showGrand("Nakakaawa")} and is aged ${childObj.grannyAge} years")

}