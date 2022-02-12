package com.studying.challenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val nextActivity: Button = findViewById(R.id.firstLoginInButton)
        nextActivity.setOnClickListener {
            goToFourthActivity()

        }

    }
}