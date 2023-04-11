
enum class Results{
    SUCCESS,
    ERROR
}

// sealed class is for closed type hierarchy
// A closed type hierarchy is a fixed set of related types
// where all possible subtypes are known and explicitly defined.
sealed class Result(val  message:String){
    fun showMessage(){
        println("Result:$message")
    }

    class Success(message: String):Result(message)
    class Error(message: String):Result(message)

    class Progress(message: String):Result(message)

}

fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress-> result.showMessage()
    }
}

