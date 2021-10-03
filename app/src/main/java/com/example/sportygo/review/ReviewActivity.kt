package com.example.sportygo.review

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportygo.R
import kotlinx.android.synthetic.main.activity_purchases.backBtn
import kotlinx.android.synthetic.main.activity_review.*

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        btn_write_a_review.setOnClickListener {
            val intent = Intent(this, ReviewFormActivity::class.java)
            startActivity(intent)
        }
    }

}