package com.example.customview.kosthub.onboarding

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.example.customview.kosthub.databinding.ActivityOnBoardingBinding
import com.example.customview.kosthub.login.Login
import com.example.customview.kosthub.register.Register

class OnBoarding : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
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

    private fun action(){
        binding.btnLogin.setOnClickListener {
            val intentlogin = Intent(this@OnBoarding, Login::class.java)
            startActivity(intentlogin)
        }
        binding.btnRegist.setOnClickListener {
            val intentregist = Intent(this@OnBoarding, Register::class.java)
            startActivity(intentregist)
        }
    }
}