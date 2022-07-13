package com.example.auto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Emergency : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)
    }

    fun click_home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}