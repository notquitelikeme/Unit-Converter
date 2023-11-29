package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Digital : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digital)
        val digitalvalue1 = findViewById<EditText>(R.id.digitaledit1)
        digitalvalue1.setOnClickListener {
            digitalvalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val digitalvalue2 = findViewById<EditText>(R.id.digitaledit2)
        digitalvalue2.setOnClickListener {
            digitalvalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Digitalspinner1: Spinner = findViewById(R.id.digitalspinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.digital_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Digitalspinner1.adapter = adapter
        }
        val Digitalspinner2: Spinner = findViewById(R.id.digitalspinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.digital_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Digitalspinner2.adapter = adapter
        }
    }
}