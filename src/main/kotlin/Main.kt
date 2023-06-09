fun main(args: Array<String>) {
// delegation
}

fun objectExpression(){
    // object expression || anonymous class
    val clickListener=ClickListener()
    val loginButton=ButtonObj("login", 1221,object:OnClickListener{
        override fun onClick() {
            println("Login onClick")
        }
    } )
    val signUpButton = ButtonObj("Sign up", 2123, object:OnClickListener{
        override fun onClick() {
            println("SignUp onClick")
        }
    })
}
fun sealCls(){
    val success=Result.Success("Success!")
    val error=Result.Error("Error")
    val progress = Result.Progress("Progress 50%")

    getData(progress)
}

// inheritance 2 example
fun buttons(){
    val button=Button("TextView", "vertical")
    button.draw()
    val roundedButton=RoundedButton("Rounded Button","horizontal", 80)
    roundedButton.draw()
}

// inherited From Vehicle
fun carFun(){
    val car = Car("BMW", "Black",2,4)
    car.move()
    car.stop()
}
fun planeFun(){
    val plane = Car("BMW Plane", "Black Plane",23,445)
    plane.move()
    plane.stop()
}

// oop challenge #1
fun account(){
    val account= Bank("Aung")
    account.deposit(2000)
    account.withdraw(300)
    val balance = account.calculateBalance()
    println(balance)
}

fun innerCls(){
    val listView= ListView(arrayOf("name1","name2","name3"))
    listView.ListViewItem().displayItem(2)
}
fun enumCls(){
    println(Direction.EAST.distance)
    Direction.EAST.printData()
    val direction= Direction.valueOf("EAST")
    when(direction){
        Direction.EAST->{
            println("erqae")
        }
        else->{
            println("dfsdf")
        }
    }

    for (direction in Direction.values()){
        println(direction)
    }
}
fun lazyInit(){
    //    val user1=User
    var user1=User("Alex", lastName="Dubbin",23)

    // lazy initialization
    val user2 by lazy {
        User("Alex2", lastName="Dubbin2",23)
    }
    // user2 won't create yet

    // now it will. becuz it only created when called the object
    // to save memory
    println(user2.firstName)
}

fun extra(){
    val user1=User("Alex", lastName="Dubbin",23)
    user1.favouriteMovie= "The Egyptian"

    // companion object
    Calculator.sum(10,5)

    //singleton
    // only one instance of class
    val instance = DatabaseOld.getInstance()
    println(instance)
    val instance2= DatabaseOld.getInstance()
    println(instance2)

    // singleton new way
    println(Database)
    println(Database)
}

fun dts(){
    var x=arrayOf(1.toByte(), 1.toShort(), 1.toLong())
    for(i in x){
        if(i is Byte){
            println(Byte.MAX_VALUE)
        }
        else if(i is Short){
            println(Short.MAX_VALUE)
        }
        else{
            println(Long.MAX_VALUE)
        }
    }
}