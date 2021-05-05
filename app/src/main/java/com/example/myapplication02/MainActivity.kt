package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    val start =1
    val end = 50
    var b:Boolean? =null
    super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rnds = (start..end).random()
        print("Write any number: ")
        val number : EditText = findViewById(R.id.edNumber)
        val button  : Button  = findViewById(R.id.button)
        for (i in 1..3){
        button.setOnClickListener {
            if (number.toString().toInt() == rnds.toInt()) {
                println("Braavoo")
            } else {
                if (number.toString().toInt() < rnds.toInt()) {
                    println("c'est encore plus petit")
                } else println("c'est encore plus Grand")
            }
        }
        }







    }
}

