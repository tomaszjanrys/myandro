package com.example.myandro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myactivity_1)
        var counter =0 ;
        val myviewtext_1 : TextView = findViewById(R.id.myTextView1)
        myviewtext_1.setText("Witaj w Moim Andro : ")

        val myviewtext_2 : TextView = findViewById(R.id.myTextView2)
        myviewtext_2.setText("Lorem Ipsum Ipsum Lorem "+counter)

        //buttons zmiana tekstu wywolanie funkcji po kliknieciu
        val btnStart: Button = findViewById(R.id.button2)
        btnStart.setOnClickListener{
            myviewtext_2.setText("Click i robisz co chcesz")
            myviewtext_2.setText("${counter}");
            counter++;
            Toast.makeText(this,"yes,",Toast.LENGTH_SHORT).show()
        }

        //click in layout

        val mainclicklayoyt: LinearLayout = findViewById(R.id.main_layout)

        mainclicklayoyt.setOnClickListener{
            btnStart.setText("${counter}")
            counter--
        }



    }



}