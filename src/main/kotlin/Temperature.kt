class Temperature {
    fun show(){
        printFinalTemperature(27f,"celcius","Fahrenheit",celciusToFahrenheit(27f))
        printFinalTemperature(350f,"Kelvin","Celcius",kelvinToCelcius(350f))
        printFinalTemperature(10f,"Fahrenheit","Kelvin",fahrenheitToKelvin(10f))
    }

    fun printFinalTemperature(initialMeasurement:Float,initialUnit:String,finalUnit:String,conversionFormula:Float){
        var finalMeasurement = String.format("%.2f",conversionFormula)
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit .")
    }
    private fun celciusToFahrenheit(c:Float):Float {

        return 9f/5f*c+32
    }

    fun kelvinToCelcius(k:Float):Float {
        return k-273.15f
    }

    fun fahrenheitToKelvin(f:Float):Float{
        return 5f/9f*(f-32)+273.15f
    }
}