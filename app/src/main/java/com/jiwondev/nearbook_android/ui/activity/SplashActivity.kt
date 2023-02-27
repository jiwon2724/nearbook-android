package com.jiwondev.nearbook_android.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.jiwondev.nearbook_android.R
import com.jiwondev.nearbook_android.resource.NearbookApplication
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getUser()
    }

    private fun getUser() {
        val database = (application as NearbookApplication).database.userInfoDao()
        CoroutineScope(Dispatchers.IO).launch {
            val userInfo = database.gentUserInfo()

            withContext(Dispatchers.Main) {
                userInfo?.let { moveActivity(MainActivity::class.java) } ?: moveActivity(NicknameActivity::class.java)
            }
        }
    }

    private fun moveActivity(clazz: Class<*>) {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, clazz))
            finish()
        }, 2000)
    }
}