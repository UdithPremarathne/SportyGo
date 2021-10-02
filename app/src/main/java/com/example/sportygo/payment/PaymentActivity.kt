package com.example.sportygo.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sportygo.R
import com.example.sportygo.checkout.CheckoutActivity
import com.example.sportygo.contact.ContactActivity
import com.example.sportygo.home.HomeActivity
import com.example.sportygo.shipping.ShippingActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
    }

    fun backToHome(view: View) {
        val intent = Intent(this@PaymentActivity, CheckoutActivity::class.java)
        startActivity(intent)
    }

    fun toShipping(view: View) {
        val intent = Intent(this@PaymentActivity, ShippingActivity::class.java)
        startActivity(intent)
    }

    fun toContactus(view: View) {
        val intent = Intent(this@PaymentActivity, ContactActivity::class.java)
        startActivity(intent)
    }
}

