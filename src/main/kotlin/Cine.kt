class Cine {
    val child = 7
    val adult = 28
    val senior = 87
    val isMonday = true
    fun show(){
        println("The movie ticket price for a person aged $child is /$${ticketPrice(child, isMonday)}.")
        println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
        println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    }
//    fun ticketPrice(age:Int,isMonday:Boolean):Int{
//        if(age >= 13 && age <=60 && !isMonday){
//            return 30
//        }else if(age > 60){
//            return 20
//        }else if (age <13){
//            return 15
//        }else {
//            return 25
//        }
//    }

    private fun ticketPrice(age:Int, isMonday:Boolean):Int{
        return if(age in 13..60 && !isMonday) 30 else (if(age > 60) 20 else if(age < 13) 15 else 25)
    }
}