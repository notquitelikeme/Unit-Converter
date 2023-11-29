package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Area : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)
        val areavalue1 = findViewById<EditText>(R.id.areaedit1)
        areavalue1.setOnClickListener {
            areavalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val areavalue2 = findViewById<EditText>(R.id.areaedit2)
        areavalue2.setOnClickListener {
            areavalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Areaspinner1: Spinner = findViewById(R.id.areaspinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.area_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Areaspinner1.adapter = adapter
        }
        val Areaspinner2: Spinner = findViewById(R.id.areaspinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.area_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Areaspinner2.adapter = adapter
        }
    }
}