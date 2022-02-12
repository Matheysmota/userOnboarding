package com.studying.challenge2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nextActivity1: Button = findViewById(R.id.secondNextButton)
        nextActivity1.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)

            startActivity(intent)

        }

        val skipButton: Button = findViewById(R.id.secondSkipButton)
        skipButton.setOnClickListener {
            goToFourthActivity()
        }

    }


}