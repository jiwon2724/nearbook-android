package com.jiwondev.nearbook_android.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.jiwondev.nearbook_android.R

abstract class BaseActivity<T : ViewBinding>(val bindingFactory: (LayoutInflater) -> T) : AppCompatActivity() {
    private lateinit var _binding: T
    val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingFactory(layoutInflater)
        setContentView(binding.root)
    }

    fun moveActivity(clazz: Class<*>) {
        startActivity(Intent(this, clazz))
        finish()
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}