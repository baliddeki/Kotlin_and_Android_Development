package com.example.userinteractions

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var clickButton: Button
    lateinit var myLayout: ConstraintLayout
    lateinit var snackButton: Button
    lateinit var buttonDialog: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.button)
        myLayout = findViewById(R.id.myLayout)
        snackButton =findViewById(R.id.buttonSnackBar)
        buttonDialog = findViewById(R.id.buttonDialog)
        clickButton.setOnClickListener{
            Toast.makeText(applicationContext, "This is a toast message", Toast.LENGTH_LONG).show()
        }

        snackButton.setOnClickListener{
            Snackbar.make(myLayout, "This is snackbar message", Snackbar.LENGTH_INDEFINITE).setAction("OK", View.OnClickListener {

            }).show()
        }

        buttonDialog.setOnClickListener{
            showAlertDialog()
            buttonDialog.setOnClickListener{
                Toast.makeText(applicationContext, "This is now a toast message", Toast.LENGTH_LONG).show()

            }
        }

    }

    private fun showAlertDialog() {
        var alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog.setTitle("Change alert to toast")
            .setMessage("Do you want to change this to a toast button")
            .setIcon(R.drawable.warning_icon)
            .setCancelable(false)
            .setNegativeButton("NO", DialogInterface.OnClickListener{
                dialog: DialogInterface?, which: Int ->
                dialog?.cancel()
            })
            .setPositiveButton("YES", DialogInterface.OnClickListener{dialog, which ->
                buttonDialog.text = clickButton.text
            })
        alertDialog.create().show()

    }
}