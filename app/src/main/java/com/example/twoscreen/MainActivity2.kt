package com.example.twoscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv4 = findViewById<TextView>(R.id.textView)
        val tv5 = findViewById<TextView>(R.id.textView2)
        val tv6 = findViewById<TextView>(R.id.textView3)

        val iv = intent.getStringExtra("Data")

        tv4.text = iv.toString()
        tv5.text = iv.toString()
        tv6.text = iv.toString()






    }
}