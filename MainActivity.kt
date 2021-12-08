package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val key = "com.example.myapp"
//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Here we're creating a function that would be called when the user taps the send button
    fun sendMessage(view : View){
        val editText = findViewById<EditText>(R.id.text) //grabs the editText view object in activity_main layout
        val message = editText.text.toString() // sets the text attribute of editText to a variable
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(key, message) // Here we declare the intent that binds MainActivity and MainActivity2
            //PutExtra adds the value stored in message to the intent
        }

        startActivity(intent) //starts the instance of MainActivity2
    }

}
