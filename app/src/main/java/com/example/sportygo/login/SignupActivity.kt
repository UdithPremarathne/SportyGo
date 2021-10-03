package com.example.sportygo.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PatternMatcher
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.util.Patterns
import android.widget.TextView
import com.example.sportygo.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignupActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val goLogin = findViewById<TextView>(R.id.goLogin)
        

        goLogin.setOnClickListener {

            val myIntent = Intent(this, LoginActivity::class.java)
            startActivity(myIntent)

            goLogin.movementMethod = LinkMovementMethod.getInstance();
        }
    }



}