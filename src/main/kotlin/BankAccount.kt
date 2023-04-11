class Bank(var accountName:String) {
    var balance=0
    var transaction= mutableListOf<Int>()

    fun deposit(depo:Int){
        if(depo>0){
            transaction.add(depo)
            balance+=depo
            println("$depo deposited. Balance is now ${balance}")
        }
    }
    fun withdraw(withdrawnAmount:Int){
        if(withdrawnAmount>0) {
            transaction.add(-withdrawnAmount)
            balance -= withdrawnAmount
            println("$withdrawnAmount deposited. Balance is ${balance}")
        }
        else
            println("$withdrawnAmount is less than 0")
    }
    fun calculateBalance():Int {
        this.balance = 0
        this.balance=transaction.reduce{
            acc,cur->acc+cur
        }
        return this.balance
    }
}

