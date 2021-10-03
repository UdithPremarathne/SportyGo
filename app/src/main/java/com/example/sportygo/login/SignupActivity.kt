package com.example.sportygo.login

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PatternMatcher
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.sportygo.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class SignupActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupNow = findViewById<Button>(R.id.signupNow)

        signupNow.setOnClickListener {
            signUpUser()
        }
        val goLogin = findViewById<TextView>(R.id.goLogin)
        goLogin.setOnClickListener {

            val myIntent = Intent(this, LoginActivity::class.java)
            startActivity(myIntent)

            goLogin.movementMethod = LinkMovementMethod.getInstance();
        }
    }

    private fun signUpUser(){
        val name = findViewById<EditText>(R.id.name)
        val email2 = findViewById<EditText>(R.id.email2)
        val phoneNumber = findViewById<EditText>(R.id.phoneNumber)
        val password = findViewById<EditText>(R.id.password)

        if (email2.text.toString().isEmpty()) {
            email2.error = "Please enter email"
            email2.requestFocus()
            return
        }


        if (!Patterns.EMAIL_ADDRESS.matcher(email2.text.toString()).matches()) {
            email2.error = "Please enter valid email"
            email2.requestFocus()
            return
        }

        if (password.text.toString().isEmpty()) {
            password.error = "Please enter password"
            password.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(email2.text.toString().isEmpty().toString(),
            password.text.toString().isEmpty().toString()
        )
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    user!!.sendEmailVerification()
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                startActivity(Intent(this,LoginActivity::class.java))
                                finish()
                            }
                        }

                } else {

                    Toast.makeText(baseContext, "SIgnUp failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }

    }

}