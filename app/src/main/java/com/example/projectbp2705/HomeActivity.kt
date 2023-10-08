package com.example.projectbp2705

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.menu4)

        btnMore.setOnClickListener {
            val intent = Intent( this,AboutActivity::class.java)
            startActivity(intent)
        }
    }
}