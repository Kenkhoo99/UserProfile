package com.example.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account__info)

        supportActionBar!!.title = "Account Info"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
