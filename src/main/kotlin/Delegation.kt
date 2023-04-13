interface A{
    fun print()
}

class App():A by FirstDelegate(),B by SecondDelegate(){
    override fun print() {
        TODO("Not yet implemented")
    }
    override fun print2(){

    }
}
// error
//class AppWithoutDelegation(): FirstDelegate(),SecondDelegate()
interface B{
    fun print2()

}

open class FirstDelegate():A{
    override fun print() {
        TODO("Not yet implemented")
    }
}

open class SecondDelegate():B{
    override fun print2(){

    }


}