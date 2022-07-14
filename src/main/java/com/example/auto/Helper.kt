package com.example.auto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Helper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helper)
    }
    fun click_owner(view: View){
        val intent = Intent(this, TypeViolations::class.java)
        startActivity(intent)
    }
    fun click_back(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun click_home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}