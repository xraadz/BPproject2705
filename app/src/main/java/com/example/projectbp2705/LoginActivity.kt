package com.example.projectbp2705

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btnLogin)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        val logObj = Login()

        //event
        btnLogin.setOnClickListener {
            //input
            logObj.username = txtUsername.text.toString()
            logObj.password = txtPassword.text.toString()
            //validasi login
            if(logObj.loginCheck() == true ){
                //call home activity
                val intentHome = Intent(this,HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}