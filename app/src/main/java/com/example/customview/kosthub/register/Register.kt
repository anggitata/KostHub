package com.example.customview.kosthub.register

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets
import android.view.WindowManager
import com.example.customview.kosthub.R
import com.example.customview.kosthub.databinding.ActivityRegisterBinding
import com.example.customview.kosthub.login.Login
import com.example.customview.kosthub.onboarding.OnBoarding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        action()
    }

    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }

    private fun action() {
        binding.btnBack.setOnClickListener{
            val intentBack = Intent(this@Register, OnBoarding::class.java)
            startActivity(intentBack)
        }
        binding.btnRegist.setOnClickListener{
            val intentRegist = Intent (this@Register, Login::class.java)
            startActivity(intentRegist)
        }
    }
}