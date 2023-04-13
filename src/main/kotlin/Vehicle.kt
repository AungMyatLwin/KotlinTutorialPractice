
// interface(to share behaviour) but not actual code

interface Engine{
    fun startEnginge()
}


// parent class
open class Vehicle(val name: String, val color:String): Vehicles() {
   open fun move(){
        println("$name is moving")
    }
   open fun stop() {
        println("$name stopped")
    }

    override fun move2() {
        println("Implemented from ABS cls")
    }

    override fun stop2() {
        println("Implemented from ABS cls")
    }

    override fun startEnginge() {
        TODO("Not yet implemented")
    }
}

// abstract class
abstract class Vehicles:Engine{
    abstract fun move2()
    abstract fun stop2()
}