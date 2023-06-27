package com.example.devpractice

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var femaleBox: CheckBox
    private lateinit var maleBox: CheckBox
    private lateinit var genderText: TextView
    private lateinit var redButton: RadioButton
    private lateinit var greenButton: RadioButton
    private lateinit var yellowButton: RadioButton
    private lateinit var mainLayout: ConstraintLayout
    private lateinit var changeColor: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*

        femaleBox = findViewById(R.id.checkBoxF)
        maleBox = findViewById(R.id.checkBoxM)
        genderText = findViewById(R.id.displayTextView)

        femaleBox.setOnClickListener{
            if (femaleBox.isChecked){
                genderText.text = "Your gender is female"
                maleBox.isChecked = false

            }else{
                genderText.text = "Check your gender"
            }
        }

        maleBox.setOnClickListener{
            if (maleBox.isChecked){
                genderText.text = "Your gender is male"
                femaleBox.isChecked = false
            }else{
                genderText.text = "Check your gender"
            }
        }*/

        redButton = findViewById(R.id.radioButtonRed)
        greenButton = findViewById(R.id.radioButtonGreen)
        yellowButton = findViewById(R.id.radioButtonYellow)
        changeColor = findViewById(R.id.displayTextView)
        mainLayout = findViewById(R.id.mainLayout)

        changeColor.setOnClickListener{
            if (redButton.isChecked){
                mainLayout.setBackgroundColor(Color.RED)
                greenButton.isChecked =false
                yellowButton.isChecked = false
            }
            else if (greenButton.isChecked){
                mainLayout.setBackgroundColor(Color.GREEN)
                redButton.isChecked = false
                yellowButton.isChecked = false
            }
            else if (yellowButton.isChecked){
                mainLayout.setBackgroundColor(Color.YELLOW)
                greenButton.isChecked = false
                redButton.isChecked = false
            }
        }


    }
}