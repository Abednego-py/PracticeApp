package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val msg = intent.getStringExtra(key) // grab the intent that started the activity and get message
        val textView = findViewById<TextView>(R.id.text2)
        textView.text = msg // set the text attribute of the textView in activity_main2 layout to message
    }


}