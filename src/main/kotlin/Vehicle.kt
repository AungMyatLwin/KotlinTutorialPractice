// parent class
open class Vehicle(val name: String, val color:String){
    fun move(){
        println("$name is moving")
    }
    fun stop() {
        println("$name stopped")
    }
}