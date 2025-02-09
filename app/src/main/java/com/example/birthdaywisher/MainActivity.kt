package com.example.birthdaywisher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val et = findViewById<TextInputEditText>(R.id.input)
        val btn = findViewById<Button>(R.id.submit)

        btn.setOnClickListener {
            val name = et.editableText.toString()
            val intent = Intent(this, GreetingCard::class.java)
            intent.putExtra(GreetingCard.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}