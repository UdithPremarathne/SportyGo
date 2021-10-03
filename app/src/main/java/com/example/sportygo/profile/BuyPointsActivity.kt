package com.example.sportygo.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportygo.R
import com.example.sportygo.rewards.FriendsActivity
import com.example.sportygo.rewards.RewardsActivity
import kotlinx.android.synthetic.main.activity_rewards.*

class BuyPointsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_points)

        btn_my_points.setOnClickListener {
            val intent = Intent(this, RewardsActivity::class.java)
            startActivity(intent)
        }

        btn_buy_points.setOnClickListener {
            val intent = Intent(this, BuyPointsActivity::class.java)
            startActivity(intent)
        }

        btn_friends.setOnClickListener {
            val intent = Intent(this, FriendsActivity::class.java)
            startActivity(intent)
        }

    }
}