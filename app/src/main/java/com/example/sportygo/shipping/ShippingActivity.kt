package com.example.sportygo.shipping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.sportygo.R
import com.example.sportygo.contact.ContactActivity
import com.example.sportygo.home.HomeActivity
import com.example.sportygo.payment.PaymentActivity

class ShippingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shipping)

        //get the spinner from the xml.
        //ALL dropdowns
        val dropdown = findViewById<Spinner>(R.id.spinner4)
        val dropdown1 = findViewById<Spinner>(R.id.spinner5)


//create a list of items for the spinner.
        val items = arrayOf("Colombo", "Kandy", "Galle", "Negombo", "Trincomalee", "Jaffna")
        val items1 = arrayOf("Western", "Central", "Southern", "Eastern", "Northern", "North Central")


//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items1)


//set the spinners adapter to the previously created one.

        dropdown.adapter = adapter
        dropdown1.adapter = adapter1

    }

    fun backToHome(view: View) {
        val intent = Intent(this@ShippingActivity, PaymentActivity::class.java)
        startActivity(intent)
    }

    fun toContactus(view: View) {
        val intent = Intent(this@ShippingActivity, ContactActivity::class.java)
        startActivity(intent)
    }

}
