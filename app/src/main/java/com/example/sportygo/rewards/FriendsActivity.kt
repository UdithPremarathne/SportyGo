package com.example.sportygo.rewards

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.sportygo.R
import com.example.sportygo.profile.BuyPointsActivity
import com.google.android.material.chip.Chip
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_rewards.*


class FriendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        val chip_gift = findViewById<Chip>(R.id.chip_gift) as Chip
        chip_gift.setOnClickListener {
            val intent = Intent(this, GiftActivity::class.java)
            startActivity(intent)
        }

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