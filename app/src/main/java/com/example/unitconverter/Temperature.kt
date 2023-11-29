package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

enum class MeasurementGroups{
    Temperature, Unknown;
}
enum class  MeasurementUnits{
    Celsius, Fahrenheit, Kelvin,
    Unknown;
    fun getGroup() = when (this) {
        Celsius, Fahrenheit, Kelvin -> MeasurementGroups.Temperature
        else -> MeasurementGroups.Unknown
    }
    fun getProperUnitName(value: Double) = when (this) {
        Celsius -> if (value == 1.0) "degree Celsius" else "degrees Celsius"
        Fahrenheit -> if (value == 1.0) "degree Fahrenheit" else "degrees Fahrenheit"
        Kelvin -> if (value == 1.0) "Kelvin" else "Kelvins"
        else -> "???"
    }
    fun getConversionValues() = when (this) {
//        Celsius -> 1.0
//        Fahrenheit -> 33.8
//        Kelvin -> 274.15
        else -> 0.0
    }
}
fun getUnit(spinner: Spinner): MeasurementUnits {

    var unit = spinner()
    if (unit.toLowerCase() == "degree" || unit.toLowerCase() == "degrees") {
        unit += " " + spinner.next()
    }

    return when (spinner.dropDownVerticalOffset) {
        "degree celsius", "degrees celsius", "celsius", "dc", "c" -> MeasurementUnits.Celsius
        "degree fahrenheit", "degrees fahrenheit", "fahrenheit", "df", "f" -> MeasurementUnits.Fahrenheit
        "kelvin", "kelvins", "k" -> MeasurementUnits.Kelvin
        else -> MeasurementUnits.Unknown
    }
}
fun convert(value: Double, unitFrom: MeasurementUnits, unitTo: MeasurementUnits): Double {
    return if (unitFrom == unitTo) {
        value
    } else when (Pair(unitFrom, unitTo)) {
        Pair(MeasurementUnits.Fahrenheit, MeasurementUnits.Celsius) -> (value - 32) * 5 / 9
        Pair(MeasurementUnits.Celsius, MeasurementUnits.Fahrenheit) -> value * 9 / 5 + 32
        Pair(MeasurementUnits.Celsius, MeasurementUnits.Kelvin) -> value + 273.15
        Pair(MeasurementUnits.Kelvin, MeasurementUnits.Celsius) -> value - 273.15
        Pair(MeasurementUnits.Kelvin, MeasurementUnits.Fahrenheit) -> value * 9 / 5 - 459.67
        Pair(MeasurementUnits.Fahrenheit, MeasurementUnits.Kelvin) -> (value + 459.67) * 5 / 9
        else -> value * unitFrom.getConversionValues() / unitTo.getConversionValues()
    }
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Enter what you want to convert (or exit): ")

        val isNum = scanner.hasNextDouble()
        val inputValue = scanner.next()
        if (inputValue == "exit") {
            break
        } else if (!isNum) {
            scanner.nextLine()
            println("Parse error")
        } else {
            val value = inputValue.toDouble()
            val convertFrom = getUnit(spinner = str)
            spinner.next()                                              // bypass the "to" or "in" keywords in the input
            val convertTo = getUnit(spinner = temperaturevalue2)

            if (convertTo.getGroup() != convertFrom.getGroup() || convertTo == MeasurementUnits.Unknown) {
                println("Conversion from ${convertFrom.getProperUnitName(1.5)}" +
                        " to ${convertTo.getProperUnitName(1.5)} is impossible")
                continue
            }

            if (convertFrom.getGroup() != MeasurementGroups.Temperature && value < 0) {
                println("${convertFrom.getGroup()} shouldn't be negative")
                continue
            }

            val conversionResult = convert(value, convertFrom, convertTo)
            println("$value ${convertFrom.getProperUnitName(value)} " +
                    "is $conversionResult ${convertTo.getProperUnitName(conversionResult)}")
        }
    }
}
class Temperature : /** Other Classes, */AdapterView.OnItemSelectedListener {

    var temperature_list = arrayOf("Celsius", "Fahrenheit", "Kelvin")

    //Bind views
    val list = view.findViewById<RecyclerView>(R.id.rvtemperature)

//    //create layout manager
//    val layoutManager = LinearLayoutManager(context)
//    list.layoutManager = layoutManager


    //Set Dropdown list
    val spinner = view.findViewById<Spinner>(R.id.temperaturespinner1)
    val adapter = ArrayAdapter<String>(view.context, android.R.layout.simple_spinner_dropdown_item,
        android.R.id.text1, convert(unitFrom = MeasurementUnits.Celsius, value = Double, unitTo = MeasurementUnits.Fahrenheit))
    spinner.adapter = adapter


    spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener {
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            val selected = parent?.getItemAtPosition(position)
            Log.d("TAG", selected.toString())
        }
        override fun onNothingSelected(parent: AdapterView<*>?) {
            println("nothing selected")
        }
    }
}
}
//        setContentView(R.layout.activity_temperature)
//        val temperaturevalue1 = findViewById<EditText>(R.id.temperatureedit1)
//        temperaturevalue1.setOnClickListener {
//            temperaturevalue1.inputType = InputType.TYPE_CLASS_NUMBER
//        }
//        val temperaturevalue2 = findViewById<TextView>(R.id.temperatureedit2)
//        temperaturevalue2.setOnClickListener {
//            temperaturevalue2.inputType = InputType.TYPE_CLASS_NUMBER
//        }
//        val Temperaturespinner1: Spinner = findViewById(R.id.temperaturespinner1)
//// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.temperature_list,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            // Specify the layout to use when the list of choices appears
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            // Apply the adapter to the spinner
//            Temperaturespinner1.adapter = adapter
//        }
//        val Temperaturespinner2: Spinner = findViewById(R.id.temperaturespinner2)
//// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.temperature_list,
//            android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            // Specify the layout to use when the list of choices appears
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            // Apply the adapter to the spinner
//            Temperaturespinner2.adapter = adapter
//        }
//    }
//}