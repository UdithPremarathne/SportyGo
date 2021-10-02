package com.example.sportygo.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import com.example.sportygo.R
import android.content.Intent
import android.view.View


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
    }

    fun hotDlzClick(view: View?) {
        val intent = Intent(this@HomeActivity, CategoryActivity::class.java)
        startActivity(intent)
    }
}