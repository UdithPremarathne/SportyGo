package com.example.sportygo.review

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sportygo.R

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val btnWriteReview = findViewById<Button>(R.id.btn_write_a_review)

        btnWriteReview.setOnClickListener {
            val intent = Intent(this, ReviewFormActivity::class.java)
            startActivity(intent)
        }
    }

}