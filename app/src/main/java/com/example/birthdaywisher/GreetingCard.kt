package com.example.birthdaywisher

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class GreetingCard : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_greeting_card)

        val et = findViewById<TextView>(R.id.tv)
        val name = intent.getStringExtra(NAME_EXTRA)
        et.text = "Happy Birthday $name!"

    }
}