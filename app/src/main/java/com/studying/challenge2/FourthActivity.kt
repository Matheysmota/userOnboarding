package com.studying.challenge2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val logiIn: Button = findViewById(R.id.loginButton)
        logiIn.setOnClickListener {
            Toast.makeText(this, "Acessando sua conta...", Toast.LENGTH_SHORT).show()

        }
        val nextActivity: Button = findViewById(R.id.secondSignInButton)
        nextActivity.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java )
            startActivity(intent)
        }

        val forgetPassword: Button = findViewById(R.id.forgotPasswordButton)
        forgetPassword.setOnClickListener {
            Toast.makeText(this, "Que pena", Toast.LENGTH_SHORT).show()
        }
    }
}