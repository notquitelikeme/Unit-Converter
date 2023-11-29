package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Mass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mass)
        val massvalue1 = findViewById<EditText>(R.id.massedit1)
        massvalue1.setOnClickListener {
            massvalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val massvalue2 = findViewById<EditText>(R.id.massedit2)
        massvalue2.setOnClickListener {
            massvalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Massspinner1: Spinner = findViewById(R.id.massspinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.mass_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Massspinner1.adapter = adapter
        }
        val Massspinner2: Spinner = findViewById(R.id.massspinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.mass_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Massspinner2.adapter = adapter
        }
    }
}