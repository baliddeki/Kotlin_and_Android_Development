open class Parent {

    var parentName: String? = null
    var parentAge: Int? = null



    //method to show parent details
    fun parentDetails(){
        println("Parent name is $parentName \n" +
                "Parent age is $parentAge")
    }

    //code to demonstrate function overriding
    open fun animalSound(){
        println("This is animal sound from the parent")

    }

}