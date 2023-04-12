
class User(var firstName:String, var lastName:String = "LastName", var age:Int){
    lateinit var favouriteMovie: String
    // init for lazy init
    init {
        println("User :$firstName was created")
    }
    // equals, hashcode and toString inherited from Any cls
    // can be overridden
    override fun equals(other: Any?): Boolean {

        if(this===other){
            return true
        }
        if (other is User){
            return  this.firstName== other.firstName && this.lastName==other.lastName && this.age==other.age
        }
        return false
    }

    // if equals override, must also override hashcode
    override fun hashCode(): Int {
        return 0
    }
}
data class User1(var firstName:String, var lastName:String = "LastName", var age:Int){
    // for comparing, shaping and storing data
    // automatically generated hashcode, equals and toString
}

// singleton old way
class DatabaseOld private constructor (){
    companion object{
        private  var instance: DatabaseOld?=null

        fun getInstance():DatabaseOld? {
            if(instance == null){
                instance=DatabaseOld()
            }
            return instance
        }
    }
}

// singleton new way
object  Database{
    init {
        println("Database Created")
    }
}

// enum class
enum class Direction(var direction:String, var distance:Int){
    NORTH("north", 20),
    SOUTH("south", 30),
    EAST("east", 22),
    WEST("west", 25);

    fun printData(){
        println("This is function in enum")
    }
}

// inner class
class ListView(val item:Array<String>){
    inner class ListViewItem(){
        fun displayItem(position:Int){
            println("${item[position]}")
        }
    }
}