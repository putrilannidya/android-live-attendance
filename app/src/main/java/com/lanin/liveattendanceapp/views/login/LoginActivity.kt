package com.lanin.liveattendanceapp.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lanin.liveattendanceapp.R
import org.jetbrains.anko.startActivity
import com.lanin.liveattendanceapp.databinding.ActivityLoginBinding
import com.lanin.liveattendanceapp.views.forgotpass.ForgotPasswordActivity
import com.lanin.liveattendanceapp.views.main.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            startActivity<MainActivity>()
        }

        binding.btnForgotPassword.setOnClickListener {
            startActivity<ForgotPasswordActivity>()
        }
    }
}