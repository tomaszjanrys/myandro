package com.example.myandro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.myandro.databinding.Activity1Binding
import com.example.myandro.databinding.Activity3Binding
import com.example.myandro.databinding.Activity4Binding

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
//btn new activity 2
        val btnActivity2: Button = findViewById(R.id.btnNewActivity2)
        btnActivity2.setOnClickListener{
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)

            Toast.makeText(this,"Nowe okno", Toast.LENGTH_SHORT).show()
        }
//activity 4

        val btnActivty4 : Button = findViewById(R.id.btnAtivity4ID)
                btnActivty4.setOnClickListener{
                    val intentAct4 = Intent(this, Activity4::class.java)
                    startActivity(intentAct4)
                }


    }



}