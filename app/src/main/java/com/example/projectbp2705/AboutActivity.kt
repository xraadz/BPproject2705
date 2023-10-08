package com.example.projectbp2705

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val call:ImageView = findViewById(R.id.imageCall)
        val web:ImageView = findViewById(R.id.imageWeb)
        val location:ImageView = findViewById(R.id.imageLocation)

        //dial numbero
        call.setOnClickListener {
            val callIntent: Intent=Uri.parse("089666138975").let {
                number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        //websaito
        web.setOnClickListener {
            val webIntent:Intent = Uri.parse("https://www.instagram.com/ra_ditzu/").let{
                webpage->Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        //lokasion
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
    }
}