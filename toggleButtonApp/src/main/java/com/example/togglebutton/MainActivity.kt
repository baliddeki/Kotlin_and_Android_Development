package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView =findViewById(R.id.imageView2)
        textView = findViewById(R.id.textView2)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener{compoundButton, isChecked ->
            if (isChecked){
                imageView.visibility = View.INVISIBLE
                textView.text = "IMAGE IS INVISIBLE"
            }
            else{
                imageView.visibility = View.VISIBLE
                textView.text = "IMAGE IS VISIBLE"
            }
        }
    }
}