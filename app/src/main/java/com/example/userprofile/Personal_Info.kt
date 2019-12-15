package com.example.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Personal_Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal__info)

        supportActionBar!!.title = "Personal Info"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
