package com.example.mysmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SelectRoutineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_routine)
        val createButton = findViewById<FloatingActionButton>(R.id.select_add_routineBtn)
        // Set a click listener on the FloatingActionButton
        createButton.setOnClickListener {
            // Handle the click event here
            val intent = Intent(this, CreateRoutineActivity::class.java)
            startActivity(intent)
        }
    }
}