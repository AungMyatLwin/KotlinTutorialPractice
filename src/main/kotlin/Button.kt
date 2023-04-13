

class ClickListener():OnClickListener{
    override fun onClick() {

    }
}
interface OnClickListener{
    fun onClick()
}
class ButtonObj(val text:String, val id:Int, onClickListener: OnClickListener){

}