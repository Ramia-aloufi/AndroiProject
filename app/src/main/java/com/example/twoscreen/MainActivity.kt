package com.example.twoscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val txt2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val txt3 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val btn1 = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val tv1 = findViewById<TextView>(R.id.textView4)
        val tv2 = findViewById<TextView>(R.id.textView5)
        val tv3 = findViewById<TextView>(R.id.textView6)

        btn1.setOnClickListener {
            val listtext = listOf<String>(txt1.text.toString(),txt2.text.toString(),txt3.text.toString())
            Toast.makeText(this,"$listtext",Toast.LENGTH_LONG).show()
        }

        btn2.setOnClickListener {
            tv1.text = txt1.text.toString()
            tv2.text = txt2.text.toString()
            tv3.text = txt3.text.toString()
        }

        btn3.setOnClickListener {
            val a = txt1.text.toString()
            val b = txt2.text.toString()
            val c = txt3.text.toString()


            val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("Data","$a $b $c")

            startActivity(intent)
        }
    }
}