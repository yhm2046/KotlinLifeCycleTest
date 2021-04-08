package com.viomi.kotlinlifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.viomi.kotlinlifecycletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag="MainActivity"
    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(tag,"onSaveInstanceState()...")
        super.onSaveInstanceState(outState) //临时保存数据
        val temdata="something str"
        outState.putString("data1",temdata)
        val temdata2=99.99
        outState.putDouble("data2",temdata2)
        val temdata3=false
        outState.putBoolean("data3",temdata3)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag,"onCreate..")
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState!=null){
            Log.d(tag,"running...........")
            Log.d(tag,"str:${savedInstanceState.getString("data1")}")
            Log.d(tag,"double:${savedInstanceState.getDouble("data2")}")
            Log.d(tag,"boolean:${savedInstanceState.getBoolean("data3")}")
        }else
            Log.d(tag,"savedInstanceState is null...........")
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