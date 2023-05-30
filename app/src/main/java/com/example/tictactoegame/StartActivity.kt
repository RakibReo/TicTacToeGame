package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoegame.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{

            val intent= Intent(this,GameActivity::class.java)
            startActivity(intent)
        }


    }
}