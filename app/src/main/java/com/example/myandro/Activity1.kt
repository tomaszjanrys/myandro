package com.example.myandro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)
        //text view layout 2
        //text view layout 2
        val txtViewLayout2 : TextView = findViewById(R.id.textViewLayout2)
        txtViewLayout2.setText("Nowe okno")


    }


}