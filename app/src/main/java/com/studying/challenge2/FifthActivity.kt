package com.studying.challenge2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FifthActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val createAccount: Button = findViewById(R.id.createAccountButton)
        createAccount.setOnClickListener {
            Toast.makeText(this, "Conta Criada!", Toast.LENGTH_SHORT).show()
        }

        val nextActivity: Button = findViewById(R.id.loginInButton)
        nextActivity.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}