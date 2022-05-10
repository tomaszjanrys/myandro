package com.example.myandro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        val myTextView1: TextView = findViewById(R.id.myTextView)
        myTextView1.setText("bowy text")

        val myTextView2: TextView = findViewById(R.id.myTextView2)
        myTextView2.setText("git push")
    }



}