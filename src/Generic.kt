import javax.lang.model.util.Elements

class usAdmin<F> (credit:F){
    init {
        println(credit)
    }
}

fun main (args:Array<String>){
    var Age = usAdmin(23)
    var Name = usAdmin("Allan")
    var tribe= usAdmin("Muganda")
    var points = usAdmin(23.235)
}