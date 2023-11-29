package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Speed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed)
        val speedvalue1 = findViewById<EditText>(R.id.speededit1)
        speedvalue1.setOnClickListener {
            speedvalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val speedvalue2 = findViewById<EditText>(R.id.speededit2)
        speedvalue2.setOnClickListener {
            speedvalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Speedspinner1: Spinner = findViewById(R.id.speedspinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.speed_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Speedspinner1.adapter = adapter
        }
        val Speedspinner2: Spinner = findViewById(R.id.speedspinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.speed_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Speedspinner2.adapter = adapter
        }
    }
}