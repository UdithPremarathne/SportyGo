package com.example.sportygo.rewards

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sportygo.R
import com.google.android.material.chip.Chip
import com.google.android.material.tabs.TabLayout


class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        val tabLayout = findViewById<View>(R.id.tab_layout_rewards) as TabLayout
        val tab = tabLayout.getTabAt(2)
        tab!!.select()

        val chip_gift = findViewById<Chip>(R.id.chip_gift) as Chip
        chip_gift.setOnClickListener {
            val intent = Intent(this, GiftActivity::class.java)
            startActivity(intent)
        }
    }
}