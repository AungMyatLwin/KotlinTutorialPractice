

// inherit from vehicle
class Car ( name:String, color:String,val engine:Int, val doors:Int):Vehicle(name,color){
    override fun move() {
        flying()
        super.move()
    }
    fun flying(){
        println("$name is flying")
    }
}