package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var spinnerCountry: Spinner
    private lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerCountry = findViewById(R.id.spinnerCountry)
        textView = findViewById(R.id.textViewCountry)
        spinnerCountry.onItemClickListener = this

        //adapter creates a link between the string arrays and the spinner view
        var arrayAdapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCountry.adapter = arrayAdapter
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent != null) {
            textView.text = parent.getItemAtPosition(position).toString()
        }
    }
}