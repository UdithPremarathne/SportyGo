package com.example.sportygo.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sportygo.R

class TrendingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trendings)
    }

    fun backBtnInTrending(view: View?) {
        val intent = Intent(this@TrendingActivity, HomeActivity::class.java)
        startActivity(intent)
    }
}
