package com.jiwondev.nearbook_android.ui.activity

import android.os.Bundle
import com.jiwondev.nearbook_android.R
import com.jiwondev.nearbook_android.databinding.ActivityNicknameBinding
import com.jiwondev.nearbook_android.resource.NearbookApplication
import com.jiwondev.nearbook_android.room.UserInfo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NicknameActivity : BaseActivity<ActivityNicknameBinding>({ActivityNicknameBinding.inflate(it)}) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        clickListener()
    }

    private fun clickListener() {
        binding.setNicknameTextView.setOnClickListener {
            if(binding.nicknameEditText.text.toString().isNotEmpty()) {
                insertNickname()
            } else {
                showToast(getString(R.string.input_nickname))
            }
        }
    }

    private fun insertNickname() {
        val database = (application as NearbookApplication).database.userInfoDao()

        CoroutineScope(Dispatchers.IO).launch {
            database.insertNickname(UserInfo(binding.nicknameEditText.text.toString()))

            withContext(Dispatchers.Main) {
                when(database.gentUserInfo().isEmpty()) {
                    true -> showToast(getString(R.string.failed_set_nickname))
                    false -> moveActivity(MainActivity::class.java)
                }
            }
        }
    }
}