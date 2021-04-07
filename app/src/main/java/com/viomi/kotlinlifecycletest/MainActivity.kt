package com.viomi.kotlinlifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.viomi.kotlinlifecycletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowNormal.setOnClickListener {
            val intent = Intent(this,NormalActivity::class.java)
            startActivity(intent)
        }
        binding.btnShowDialog.setOnClickListener {
            val intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }
    }//end oncreate

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onStart...")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume...")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause...")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"onDestroy...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onRestart...")
    }
}