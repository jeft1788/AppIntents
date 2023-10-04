package com.example.appintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
   // private var message:TextView?=null
    //private var EXTRA_MESSAGE = "com.example.appintents.MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var message = findViewById<TextView>(R.id.txtMensaje)
        //val bundle = intent.extras
        //val message = intent.getStringExtra(EXTRA_MESSAGE)
        val dato:String=intent.extras?.getString("mensaje").orEmpty()
        message?.text="El dato es $dato"

    }
}