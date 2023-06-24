class Child: Parent {
    //constructor to pick parent properties
    constructor(parentName: String, parentAge: Int){
        this.parentName = parentName
        this.parentAge = parentAge
    }



}


fun main(args: Array<String>) {
    var childObj = Child("Namikisa Grace", 55)
    childObj.parentDetails()

}