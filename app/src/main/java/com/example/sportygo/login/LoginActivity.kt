package com.example.sportygo.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Patterns
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.sportygo.R
import com.example.sportygo.databinding.ActivityLoginBinding
import com.example.sportygo.databinding.ActivityMainBinding
import com.example.sportygo.profile.EditProfileActivity
import com.example.sportygo.profile.ProfileActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = FirebaseAuth.getInstance()
        val create_account = findViewById<TextView>(R.id.create_account)
        val login = findViewById<TextView>(R.id.button)


        create_account.setOnClickListener {

            val myIntent = Intent(this, SignupActivity::class.java)
            startActivity(myIntent)

            create_account.movementMethod = LinkMovementMethod.getInstance();

        }

        login.setOnClickListener {

             doLogin()

        }
    }

    private fun doLogin() {

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

        auth.signInWithEmailAndPassword(email2.text.toString(),
            password.text.toString()
        )
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    updateUI(user)
                } else {


                    updateUI(null)
                }
            }
        }



    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser

        updateUI(currentUser)

    }

    private fun updateUI(currentUser: FirebaseUser?) {

        if(currentUser != null){
            if(currentUser.isEmailVerified){
                startActivity(Intent(this,EditProfileActivity::class.java))
                finish()
            }else{
                Toast.makeText(baseContext, "Please verify your email address",
                    Toast.LENGTH_SHORT).show()

            }


        }else{

            Toast.makeText(baseContext, "Login failed.",
                Toast.LENGTH_SHORT).show()

        }

    }

    }


