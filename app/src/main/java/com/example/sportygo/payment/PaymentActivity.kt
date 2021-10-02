package com.example.sportygo.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
        Toast.makeText(this@PaymentActivity, "Saved payment details", Toast.LENGTH_SHORT).show()
    }

    fun toContactus(view: View) {
        val intent = Intent(this@PaymentActivity, ContactActivity::class.java)
        startActivity(intent)
    }

    fun same(view: View) {
        val intent = Intent(this@PaymentActivity, PaymentActivity::class.java)
        startActivity(intent)

        Toast.makeText(this@PaymentActivity, "Changed to Cash method", Toast.LENGTH_SHORT).show()
    }

    fun same1(view: View) {
        val intent = Intent(this@PaymentActivity, PaymentActivity::class.java)
        startActivity(intent)

        Toast.makeText(this@PaymentActivity, "Currently unavailable", Toast.LENGTH_SHORT).show()
    }

}

