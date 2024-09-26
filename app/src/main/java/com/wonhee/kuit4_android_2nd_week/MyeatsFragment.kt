package com.wonhee.kuit4_android_2nd_week

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonhee.kuit4_android_2nd_week.databinding.FragmentMyEatsBinding

class MyeatsFragment : AppCompatActivity() {

    private lateinit var binding: FragmentMyEatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_my_eats)

        binding = FragmentMyEatsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetail.setOnClickListener{
            val intent = Intent(this, KeepActivity::class.java)
            startActivity(intent)
        }
    }
}