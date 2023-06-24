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

}


fun main(args: Array<String>) {
    var childObj = Child("Namikisa Grace", 55)
    childObj.parentDetails()
    childObj.animalSound()
    childObj.superSound()

}