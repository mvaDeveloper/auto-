package com.example.auto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TypeViolations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_violations)
    }
    fun click_dtp(view: View){
        val intent = Intent(this, BranchingDtp::class.java)
        startActivity(intent)
    }
    fun click_back(view: View){
        val intent = Intent(this, Helper::class.java)
        startActivity(intent)
    }
    fun click_home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}