fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun restar(a: Int, b: Int): Int {
    return a - b
}

fun multiplicar(a: Int, b: Int): Int {
    return a*b
}

fun dividir(a: Int, b: Int): Float{
    return a.toFloat()/b.toFloat()
}

fun modulo(a: Int, b: Int): Int{
    return a%b
}

fun operaciones(){
    val x = 12
    val y = 9
    println("${x}+${y} = ${sumar(x, y)}")
    println("${x}-${y} = ${restar(x,y)}")
    println("${x}*${y} = ${multiplicar(x,y)}")
    println("${x}/${y} = ${dividir(x,y)}")
    println("${x}%${y} = ${modulo(x,y)}")
}

fun if_else(a: Int, b: Int) {
    if(a>b){
        println("Mayor: ${a}")
    }else{
        println("Mayor: ${b}")
    }
    println("Menor: ${if (a < b) a else b}")
    if(a>b && (a%2 == 0)){
        println("Mayor y par: ${a}")
    }else if(a<b && (a%2 == 0)){

    }
}