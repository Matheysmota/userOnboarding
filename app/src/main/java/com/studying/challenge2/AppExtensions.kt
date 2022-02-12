package com.studying.challenge2

import android.app.Activity
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

fun Activity.goToFourthActivity(){
    val intentSkip = Intent(this, FourthActivity::class.java)
    startActivity(intentSkip)
}