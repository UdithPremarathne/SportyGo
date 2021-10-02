package com.example.sportygo.checkout

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.sportygo.R
import com.example.sportygo.contact.ContactActivity
import com.example.sportygo.home.HomeActivity
import com.example.sportygo.payment.PaymentActivity


class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        //get the spinner from the xml.
        //ALL dropdowns
        val dropdown = findViewById<Spinner>(R.id.spinner2)
        val dropdown1 = findViewById<Spinner>(R.id.spinner3)
        val dropdown2 = findViewById<Spinner>(R.id.spinner)

//create a list of items for the spinner.
        val items = arrayOf("36", "38", "40", "42", "44", "45")
        val items1 = arrayOf("Red", "Blue", "Green", "Purple")
        val items2 = arrayOf("1", "2", "3", "4", "5")

//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items2)

//set the spinners adapter to the previously created one.

        dropdown.adapter = adapter
        dropdown1.adapter = adapter1
        dropdown2.adapter = adapter2

    }

    fun backToHome(view: View) {
        val intent = Intent(this@CheckoutActivity, HomeActivity::class.java)
        startActivity(intent)
    }

    fun toPayment(view: View) {
        val intent = Intent(this@CheckoutActivity, PaymentActivity::class.java)
        startActivity(intent)
    }

    fun toContactus(view: View) {
        val intent = Intent(this@CheckoutActivity, ContactActivity::class.java)
        startActivity(intent)
    }
}
