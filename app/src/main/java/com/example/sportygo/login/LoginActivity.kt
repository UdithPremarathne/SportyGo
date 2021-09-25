package com.example.sportygo.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sportygo.R
import com.example.sportygo.databinding.ActivityLoginBinding
import com.example.sportygo.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1tn.setOnClickListener{

            replaceFragment(LoginTabFragment())

        }

        binding.fragment2tn.setOnClickListener{

            replaceFragment(SignupTabFragment())

        }

    }

    private fun replaceFragment(fragment : Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.view_page,fragment)
        fragmentTransaction.commit()

    }
}