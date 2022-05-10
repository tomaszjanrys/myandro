package com.example.myandro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myandro.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)
        //text view layout 2
        //text view layout 2
        val txtViewLayout2 : TextView = findViewById(R.id.textViewLayout2)
        txtViewLayout2.setText("Nowe okno")

        //btn back to start
        val btnBtoStart : Button = findViewById(R.id.btnBackMainAcvID)
        btnBtoStart.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
        val biding = Activity1Binding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.btnTestBIDDING.setOnClickListener{
            Toast.makeText(this,"to jest biding", Toast.LENGTH_SHORT).show()
        }
    }


}