package com.example.appintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
     //private  var EXTRA_MESSAGE = "com.example.appintents.MESSAGE"
     //private var nombre:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombre = findViewById<EditText>(R.id.edtxNombre)
        val boton =  findViewById<Button>(R.id.btn1)


        boton.setOnClickListener {
            val  mesagge:String = nombre?.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            //val preferences = getSharedPreferences("preferences", MODE_PRIVATE)
            //val editor = preferences.edit()
            intent.putExtra("mensaje", mesagge)
            //editor.commit()
            startActivity(intent)
            //Toast.makeText(this, mesagge, Toast.LENGTH_SHORT).show()

        }

    }

}