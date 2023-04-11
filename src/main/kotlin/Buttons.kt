
open class View(){
   open fun draw(){
        println("Drawing the View")
    }
}

open class Button(var text:String, val orientation:String):View(){
    override fun draw() {
        println("Drawing the button")
    }
}

class RoundedButton(text:String, orientation: String, val degree:Int):Button(text, orientation){
    override fun draw(){
        println("Drawing the rounded button")
    }
}
