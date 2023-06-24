package com.example.mysmarthome

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class AddEventActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)
        val addEventTime: TextView = findViewById(R.id.AddEventTime)
        addEventTime.setOnClickListener {
            openTimePicker()
        }
    }

    private fun openTimePicker() {
        val isSystem24Hour = is24HourFormat(this)
        val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H
        val picker = MaterialTimePicker.Builder()
            .setTimeFormat(clockFormat)
            .setHour(12)
            .setMinute(0)
            .build()

        picker.addOnPositiveButtonClickListener {
            val hour = picker.hour
            val minute = picker.minute

            val intent = Intent(this, CreateRoutineActivity::class.java)
            intent.putExtra("hour", hour)
            intent.putExtra("minute", minute)
            startActivity(intent)
        }

        picker.show(supportFragmentManager, "TAG")
    }
}
