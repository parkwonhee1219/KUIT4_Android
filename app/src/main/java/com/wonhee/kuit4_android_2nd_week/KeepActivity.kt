package com.wonhee.kuit4_android_2nd_week

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wonhee.kuit4_android_2nd_week.databinding.ActivityKeepBinding
import com.wonhee.kuit4_android_2nd_week.databinding.FragmentMyEatsBinding

class KeepActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKeepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keep)

        binding = ActivityKeepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivOurtteokbokki.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        binding.tvOurtteokbokkiName.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}