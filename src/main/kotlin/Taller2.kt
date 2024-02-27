import kotlin.math.sqrt

class Taller2 {
    fun ejer1(num:Int):String{
        return if(num%2==0) "Es par" else "Es impar"
    }

    fun ejer2(str:String):Int{
        val split = str.lowercase().split("")
        return split.count { it == "a" || it == "e" || it == "i" || it == "o" || it == "u"}
    }

    fun ejer3(arr:Array<Float>):Float{
        return arr.sum()
    }

    fun ejer4(list:List<String>):List<String>{
        return  list.sorted()
    }

    fun ejer5(num:Int,list:List<Int>):String{
        return if(list.contains(num)) "SÍ se encuentra" else "NO se encuentra"
    }

    fun ejer6(letra:Char,str:String):Int{
        return str.toCharArray().count { it == letra }
    }

    fun ejer7(list:List<Int>):Float{
        return list.average().toFloat()
    }

    fun ejer8(str:String):String{
        return if(str.split("").reversed() == str.split("")) "SÍ es palíndromo" else "NO es palíndromo"
    }

    fun ejer9(num:Int,list:List<Int>):Int{
        return list.count { it == num }
    }

    fun ejer10(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val temp = b
            b = a % b
            a = temp
        }
        return a
    }

    fun ejer11(list:MutableList<String>):List<String>{
        var i = 0
        var p:Int
        while(i<list.size){
            p = i+1
            while(p<list.size){
                if(list[i]==list[p]){
                    list.removeAt(p)
                    continue
                }
                p++
            }
            i++
        }
        return list.toList()
    }

    fun ejer12(cadena:String):String{
        return cadena.split(" ").reversed().joinToString(" ")
    }

    fun ejer13(list:List<Int>):Int{
        return list.count { it%2 == 0 }
    }

    fun ejer14(list:List<String>):List<String>{
        return list.sortedBy { it.length }
    }

    fun ejer15(num: Int):String{
        val limit = sqrt(num.toFloat())
        var i = 3
        if(num%2 == 0 && num != 2){
            return "NO es primo"
        }else{
            while(i<=limit){
                if(num%i == 0){
                    return "NO es primo"
                }
                i+= 2
            }
        }
        return "SÍ es primo"
    }
}