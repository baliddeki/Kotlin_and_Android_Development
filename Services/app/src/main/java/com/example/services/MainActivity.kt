package com.example.services

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var br = BroadcastReceiver()

    lateinit var startClassic: Button
    lateinit var stopClassic: Button
    lateinit var startJob: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startClassic = findViewById(R.id.startClassicService)
        stopClassic = findViewById(R.id.stopClassicService)
        startJob = findViewById(R.id.startJobIntentService)

        startClassic.setOnClickListener{
            intent = Intent(this@MainActivity, ServiceExample::class.java)
            startService(intent)

        }

        stopClassic.setOnClickListener{
            intent = Intent(this@MainActivity, ServiceExample::class.java)
            stopService(intent)

        }

        startJob.setOnClickListener{
            intent = Intent(this@MainActivity, JobServiceEx::class.java)
            JobServiceEx.myBackgroundService(this@MainActivity, intent)


        }
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(br, filter)

        //this.registerReceiver(BroadcastReceiver(), IntentFilter().addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED))

    }
}