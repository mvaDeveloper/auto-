package com.example.auto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerKnockedHuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_knocked_human)
    }
    fun click_back(view: View){
        val intent = Intent(this, KnockedHuman::class.java)
        startActivity(intent)
    }
    fun click_home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}