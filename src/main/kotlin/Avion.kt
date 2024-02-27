class Avion {
    var x = 0
    var y = 0
    fun arriba(a:Int){
        y+= if(y == 300) 0 else a
    }

    fun abajo(a:Int){
        y-= if(y == 0) 0 else a
    }

    fun derecha(a:Int){
        x+= if(x == 300) 0 else a
    }

    fun izquierda(a:Int){
        x-= if(x == 0) 0 else a
    }

    fun mostrar(){
        println("[${x},${y}]")
    }
}