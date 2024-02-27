class Notificacion {
    val morningNotification = 51
    val eveningNotification = 135
    fun printNotificacionSummary(numberOfMessages:Int){
        println(if(numberOfMessages>=100) "Your phone is blowin up You have 99+ notifications" else "You have ${numberOfMessages} notifications")
    }
    fun show(){
        printNotificacionSummary(morningNotification)
        printNotificacionSummary(eveningNotification)
    }
}