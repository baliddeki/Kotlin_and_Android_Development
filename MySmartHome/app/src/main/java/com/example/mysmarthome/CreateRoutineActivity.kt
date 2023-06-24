package com.example.mysmarthome

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mysmarthome.AddActionActivity
import com.example.mysmarthome.AddEventActivity
import com.example.mysmarthome.R
import com.google.android.material.floatingactionbutton.FloatingActionButton




class CreateRoutineActivity : AppCompatActivity() {
    private lateinit var addActionButton: FloatingActionButton

    private var hour = -1
    private var minute = -1
    private var enteredText: String? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routine)

        val addEventButton = findViewById<FloatingActionButton>(R.id.addEventButton)
        // Set a click listener on the FloatingActionButton
        addEventButton.setOnClickListener {
            // Handle the click event here
            val intent = Intent(this, AddEventActivity::class.java)
            startActivity(intent)
            val invisibleCondition: ConstraintLayout = findViewById(R.id.ConditionConstraint)
            invisibleCondition.visibility = VISIBLE
        }

        addActionButton = findViewById(R.id.addActionButton)
        addActionButton.setOnClickListener {
            val intent = Intent(this, AddActionActivity::class.java)
            startActivity(intent)
        }



        val hour = intent.getIntExtra("hour", -1)
        val minute = intent.getIntExtra("minute", -1)

        val enteredText = intent.getStringExtra("enteredText")
        val enteredTextView: TextView = findViewById(R.id.AddedActionTextView)

// Check if the entered text is not empty




        val timeTextView: TextView = findViewById(R.id.AddedEventsTextView)
        if (hour != -1 && minute != -1) {

            timeTextView.text = String.format("Date & Time \n The time is %02d:%02d", hour, minute)
            timeTextView.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
            val iconClock = resources.getDrawable(R.drawable.time)
            val iconSettings = resources.getDrawable(R.drawable.settings_1)
            timeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(iconClock, null, iconSettings, null)
        } else {
            timeTextView.text = getString(R.string.when_text) // Set the default text from the layout file
            timeTextView.textAlignment = View.TEXT_ALIGNMENT_CENTER
            timeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null)
        }
        saveData()
        loadData()




           }
    private fun saveData() {
        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply(){
            putString("STRING_KEY", enteredText)
            putInt("HOUR_KEY", hour)
            putInt("MINUTE_KEY", minute)

        }.apply()
        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        val savedString = sharedPreferences.getString("STRING_KEY", null)
        val savedHour = sharedPreferences.getInt("HOUR_KEY", -1)
        val savedMinute = sharedPreferences.getInt("MINUTE_KEY", -1)



    }
}