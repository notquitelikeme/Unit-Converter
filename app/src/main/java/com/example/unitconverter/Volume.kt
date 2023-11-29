package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Volume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)
        val volumevalue1 = findViewById<EditText>(R.id.volumeedit1)
        volumevalue1.setOnClickListener {
            volumevalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val volumevalue2 = findViewById<EditText>(R.id.volumeedit2)
        volumevalue2.setOnClickListener {
            volumevalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Volumespinner1: Spinner = findViewById(R.id.volumespinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.volume_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Volumespinner1.adapter = adapter
        }
        val Volumespinner2: Spinner = findViewById(R.id.volumespinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.volume_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Volumespinner2.adapter = adapter
        }
    }
}