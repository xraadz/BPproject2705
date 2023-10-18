package com.example.projectbp2705

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val telep: ImageView = findViewById(R.id.imageTelep)
        val terep: TextView = findViewById(R.id.textViewTelep)

        //dial numbero image
        telep.setOnClickListener {
            val callIntent: Intent = Uri.parse("089666138975").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        //dial numbero teks
        terep.setOnClickListener {
            val callIntent: Intent=Uri.parse("089666138975").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }
    }
}