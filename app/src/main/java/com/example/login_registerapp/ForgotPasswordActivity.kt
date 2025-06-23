package com.example.login_registerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    override fun onStart() {
        super.onStart()
        // Perform any necessary actions when the activity becomes visible
    }

    override fun onResume() {
        super.onResume()
        // Perform any necessary actions when the activity resumes from a paused state
    }

    override fun onPause() {
        super.onPause()
        // Perform any necessary actions when the activity is about to enter the background
    }

    override fun onStop() {
        super.onStop()
        // Perform any necessary actions when the activity is no longer visible
    }

    override fun onDestroy() {
        super.onDestroy()
        // Perform any necessary cleanup when the activity is destroyed
    }

    override fun onRestart() {
        super.onRestart()
        // Perform any necessary actions when the activity is restarted after being stopped
    }
}