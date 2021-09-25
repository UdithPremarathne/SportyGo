package com.example.sportygo.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.example.sportygo.R
import com.example.sportygo.review.ReviewFormActivity
import com.example.sportygo.rewards.RewardsActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val linear_editProfile = findViewById<LinearLayout>(R.id.linear_editProfile)
        val linear_rewards = findViewById<LinearLayout>(R.id.linear_rewards)

        linear_editProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        linear_rewards.setOnClickListener {
            val intent = Intent(this, RewardsActivity::class.java)
            startActivity(intent)
        }
    }
}