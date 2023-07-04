package com.example.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = BlankFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, fragment)
            .commit()

        Log.d("Message", "onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "onRestart() called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "onDestroy() called")
    }
}