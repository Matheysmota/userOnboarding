package com.studying.challenge2

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val nextActivity: Button = findViewById(R.id.firstNextButton)
        nextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

        val skipButton: Button = findViewById(R.id.firstSkipButton)
        skipButton.setOnClickListener {
            goToFourthActivity()
        }

    }


}