class Coleccion {
    fun show(){
        arrays()
    }
    fun arrays(){
        var arr1 = arrayOf(2,3,4,5,6,6)
        for(i in arr1.indices){
            print("${arr1[i]} ")
            arr1[i]++
        }
        println()
        arr1.forEach { print("$it ") }
    }
}