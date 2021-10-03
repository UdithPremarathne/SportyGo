package com.example.sportygo.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sportygo.R
import com.example.sportygo.databinding.ActivityLoginBinding
import com.example.sportygo.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = FirebaseAuth.getInstance()
        val create_account = findViewById<TextView>(R.id.create_account)

        create_account.setOnClickListener {

            val myIntent = Intent(this, SignupActivity::class.java)
            startActivity(myIntent)

            create_account.movementMethod = LinkMovementMethod.getInstance();

        }
        }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser

        updateUI(currentUser)

    }
    fun updateUI(currentUser: FirebaseUser?) {}

    }


