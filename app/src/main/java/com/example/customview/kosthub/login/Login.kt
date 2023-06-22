package com.example.customview.kosthub.login

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import com.example.customview.kosthub.MainActivity
import com.example.customview.kosthub.databinding.ActivityLoginBinding
import com.example.customview.kosthub.onboarding.OnBoarding
import com.example.customview.kosthub.utils.LoadingDialog

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var showLoading: LoadingDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
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
        binding.btnBack.setOnClickListener {
            val intentBack = Intent(this@Login, OnBoarding::class.java)
            startActivity(intentBack)
        }

        binding.btnLogin.setOnClickListener{
            val intentLogin = Intent(this@Login, MainActivity::class.java)
            startActivity(intentLogin)
        }

        binding.btnLoginGoogle.setOnClickListener{
            val intentlogingoogle = Intent(this@Login, MainActivity::class.java)
            startActivity(intentlogingoogle)
        }
    }
}