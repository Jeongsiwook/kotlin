package com.siwook.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.siwook.basicsyntax.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLog.setOnClickListener {
            Log.d(TAG, "Hello Kotlin!!")
        }

    }
}