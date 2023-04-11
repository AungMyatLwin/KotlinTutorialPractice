
class User(var firstName:String, var lastName:String = "LastName", var age:Int){
    lateinit var favouriteMovie: String
    // init for lazy init
    init {
        println("User :$firstName was created")
    }
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