package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.sql.Time

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonlength=findViewById<Button>(R.id.length)
        buttonlength.setOnClickListener{
            val i= Intent(applicationContext,Length::class.java)
            startActivity(i)
        }
        val buttonmass=findViewById<Button>(R.id.mass)
        buttonmass.setOnClickListener{
            val i= Intent(applicationContext,Mass::class.java)
            startActivity(i)
        }
        val buttontemperature=findViewById<Button>(R.id.temperature)
        buttontemperature.setOnClickListener{
            val i= Intent(applicationContext,Temperature::class.java)
            startActivity(i)
        }
        val buttonspeed=findViewById<Button>(R.id.speed)
        buttonspeed.setOnClickListener{
            val i= Intent(applicationContext,Speed::class.java)
            startActivity(i)
        }
        val buttonvolume=findViewById<Button>(R.id.volume)
        buttonvolume.setOnClickListener{
            val i= Intent(applicationContext,Volume::class.java)
            startActivity(i)
        }
        val buttonarea=findViewById<Button>(R.id.area)
        buttonarea.setOnClickListener{
            val i= Intent(applicationContext,Area::class.java)
            startActivity(i)
        }
        val buttonangle=findViewById<Button>(R.id.angle)
        buttonangle.setOnClickListener{
            val i= Intent(applicationContext,Angle::class.java)
            startActivity(i)
        }
        val buttondigital=findViewById<Button>(R.id.digital)
        buttondigital.setOnClickListener{
            val i= Intent(applicationContext,Digital::class.java)
            startActivity(i)
        }
    }
}