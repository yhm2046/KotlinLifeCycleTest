package com.viomi.kotlinlifecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viomi.kotlinlifecycletest.databinding.ActivityMainBinding
import com.viomi.kotlinlifecycletest.databinding.DialogLayoutBinding

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= DialogLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}