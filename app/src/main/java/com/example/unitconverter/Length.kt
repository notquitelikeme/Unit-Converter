package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class Length : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

        val lengthvalue1 = findViewById<EditText>(R.id.lengthedit1)
        lengthvalue1.setOnClickListener {
            lengthvalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val lengthvalue2 = findViewById<EditText>(R.id.lengthedit2)
        lengthvalue2.setOnClickListener {
            lengthvalue2.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val Lengthspinner1: Spinner = findViewById(R.id.lengthspinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.length_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Lengthspinner1.adapter = adapter
        }
        val Lengthspinner2: Spinner = findViewById(R.id.lengthspinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.length_list,
            android.R.layout.simple_spinner_item

        ).also { adapter ->

            //Crete variables that store the value of each parameter against the other

            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Lengthspinner2.adapter = adapter
        }
    }
}