package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

// Indicate extends with <:>
class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    // Override method of class to extend with <override>
    override fun onCreate(savedInstanceState: Bundle?) {
        // Call father class with <super.>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  helloText = findViewById<TextView>(R.id.hello_text)
        helloText.text = "Hello Android"

        Log.d(tag, "onCreate")
    }

    override fun onStart() {
        Log.d(tag, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy")
        super.onDestroy()
    }
}

class Persona(val name: String, val age: Int)

val o1 = Persona("Armando", 20)
val o2 = Persona("Pedro", 21)

// Create a function with <fun>
fun test() {
    o1.name
}

