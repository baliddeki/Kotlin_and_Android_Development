package com.example.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeOn: Boolean = intent!!.getBooleanExtra("state", false)

        if (isAirplaneModeOn){
            Toast.makeText(context, "Airplane mode is on", Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(context, "Airplane mode is off", Toast.LENGTH_LONG).show()
        }

    }
}