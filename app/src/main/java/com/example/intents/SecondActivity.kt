package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val mainActivityBtn = findViewById<Button>(R.id.mainActivityBtn)
        mainActivityBtn.setOnClickListener {
            //Go to main activity
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}