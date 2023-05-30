package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.tictactoegame.databinding.ActivityKotlinMainBinding

class KotlinMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKotlinMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageV.translationY= -1000f
        binding.textView.translationY=1000f

        binding.imageV.animate().translationY(0f).duration=2000
        binding.textView.animate().translationY(0f).duration=2000

        Handler(Looper.getMainLooper()).postDelayed({

            val intent= Intent(this,StartActivity::class.java)
            startActivity(intent)

        },3000)


    }
}