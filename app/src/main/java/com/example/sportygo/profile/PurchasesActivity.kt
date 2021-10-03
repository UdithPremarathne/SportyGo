package com.example.sportygo.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportygo.R
import com.example.sportygo.review.ReviewActivity
import com.example.sportygo.review.ReviewedActivity
import kotlinx.android.synthetic.main.activity_purchases.*

class PurchasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchases)

        backBtn.setOnClickListener {
            this.finish();
        }

        linear_purchased_item_0.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

    }
}