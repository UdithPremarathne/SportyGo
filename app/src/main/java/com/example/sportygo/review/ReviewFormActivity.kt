
package com.example.sportygo.review

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportygo.R
import com.example.sportygo.profile.EditProfileActivity
import kotlinx.android.synthetic.main.activity_review_form.*

class ReviewFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_form)

        btnSubmitReview.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }

}