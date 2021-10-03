package com.example.sportygo.shared

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.sportygo.R
import com.example.sportygo.profile.EditProfileActivity
import com.example.sportygo.rewards.RewardsActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.activity_profile, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        linear_editProfile.setOnClickListener {
//            val intent = Intent(this@ProfileFragment, EditProfileActivity::class.java)
//            startActivity(intent)
//        }
//
//        linear_rewards.setOnClickListener {
//            var intent = Intent(this@ProfileFragment, RewardsActivity::class.java)
//            startActivity(intent)
//        }
    }
}