package com.example.userprofile

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "Account Settings | Genius"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val button = findViewById<Button>(R.id.chg_pic)
        button.paintFlags = button.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val button2 = findViewById<Button>(R.id.personal_info)
        button2.setOnClickListener{
            val intent = Intent(this, Personal:: class.java)
            startActivity(intent)
        }
    }


}
