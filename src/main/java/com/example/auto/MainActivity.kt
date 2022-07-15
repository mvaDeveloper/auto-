package com.example.auto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click_emergency(view: View){
        val intent = Intent(this, Emergency::class.java)
        startActivity(intent)
    }

    fun click_helper(view: View){
        val intent = Intent(this, Helper::class.java)
        startActivity(intent)
    }

    fun click_home(view: View) {

    }
}