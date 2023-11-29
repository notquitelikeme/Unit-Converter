package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.webkit.WebView
import android.widget.*

class Angle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angle)
        val anglevalue1 = findViewById<EditText>(R.id.angleedit1)
        anglevalue1.setOnClickListener {
            anglevalue1.inputType = InputType.TYPE_CLASS_NUMBER
        }
        val anglevalue2 = findViewById<TextView>(R.id.angleedit2) as TextView
        anglevalue2.setOnClickListener {
            Toast.makeText(this@Angle,
            R.string.text_view, Toast.LENGTH_LONG).show()
        }
        val Anglespinner1: Spinner = findViewById(R.id.anglespinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.angle_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Anglespinner1.adapter = adapter
        }
        val Anglespinner2: Spinner = findViewById(R.id.anglespinner2)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.angle_list,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            Anglespinner2.adapter = adapter
        }

    }
}