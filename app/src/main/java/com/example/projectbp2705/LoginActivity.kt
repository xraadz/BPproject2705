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

        val btnLogin:Button = findViewById(R.id.btnLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logObj = Login()

        logObj.username = txtUsername.text.toString()
        logObj.password = txtPassword.text.toString()

        btnLogin.setOnClickListener {
        if(logObj.loginCheck() == true){
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Login gagal, cek username dan password",
                Toast.LENGTH_SHORT).show()
        }
    }
}