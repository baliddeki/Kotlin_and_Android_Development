package com.example.mysmarthome


import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.mysmarthome.R

class AddActionThingsFragment : DialogFragment() {

    private lateinit var visibleText: TextView
    private lateinit var goneText: TextView
    private lateinit var enteredTextView: TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_action_things, container, false)


        // Obtain references to both TextView elements
        visibleText = view.findViewById(R.id.AddActionThingsTextView)
        goneText = view.findViewById(R.id.AddActionThingsInvisibleTextView)


        // Set an OnClickListener on the first TextView to change it to the second TextView
        visibleText.setOnClickListener {
            visibleText.visibility = View.GONE
            goneText.visibility = View.VISIBLE
        }
        showEditTextDialog()

        return view
    }


    @SuppressLint("MissingInflatedId")
    private fun showEditTextDialog() {
        goneText.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            val inflater: LayoutInflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.enter_value, null)
            val editText: EditText = dialogLayout.findViewById(R.id.EnterValueEditText)

            with(builder) {
                setTitle("Enter a value")
                setPositiveButton("OK") { _, _ ->


                    // Initialize enteredTextView after inflating dialogLayout

                }
                setNegativeButton("Cancel") { _, _ ->
                    Log.d("Main", "Negative button clicked")
                }
                setView(dialogLayout)
                val dialog = builder.create()

                // Set an OnClickListener on the positive button of the dialog
                dialog.setOnShowListener {
                    val positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
                    positiveButton.setOnClickListener {
                        val enteredText = editText.text.toString()

                        val intent = Intent(requireContext(), CreateRoutineActivity::class.java)
                        intent.putExtra("enteredText", enteredText)
                        startActivity(intent)
                        // Dismiss the dialog
                        dialog.dismiss()
                    }
                }

                dialog.show()
            }
        }
    }

}


