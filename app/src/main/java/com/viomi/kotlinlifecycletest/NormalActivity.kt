package com.viomi.kotlinlifecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viomi.kotlinlifecycletest.databinding.ActivityMainBinding
import com.viomi.kotlinlifecycletest.databinding.NormalLayoutBinding

class NormalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= NormalLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}