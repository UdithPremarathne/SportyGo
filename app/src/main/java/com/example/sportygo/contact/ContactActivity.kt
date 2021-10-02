package com.example.sportygo.contact

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.sportygo.R


class ContactActivity : AppCompatActivity() {

    private lateinit var submitBtn : Button
    private lateinit var subject : EditText
    private lateinit var message : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        submitBtn = findViewById(R.id.submitBtn)
        subject = findViewById(R.id.subject)
        message = findViewById(R.id.message)

        var textSubject = subject.text.toString()
        submitBtn.setOnClickListener{

//            val emailIntent = Intent(Intent.ACTION_SENDTO,
//            Uri.fromParts("mailto","it18032284@my.sliit.lk", null))
//
//            
//            startActivity(Intent.createChooser(emailIntent,"Send Email..."))

            val selectorIntent = Intent(Intent.ACTION_SENDTO)
            selectorIntent.data = Uri.parse("mailto:")

            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("it18032284@my.sliit.lk"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject.text.toString())
            emailIntent.putExtra(Intent.EXTRA_TEXT, message.text.toString())
            emailIntent.selector = selectorIntent

            startActivity(Intent.createChooser(emailIntent, "Send email..."))


        }

    }

}