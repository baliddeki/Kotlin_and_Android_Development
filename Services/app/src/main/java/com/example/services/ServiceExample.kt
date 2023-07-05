package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ServiceExample: Service() {

    override fun onCreate() {
        super.onCreate()
        Log.i("service", "Classic service started")
        Log.i("service", "Service thread, "+Thread.currentThread().name)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("service", "Classic service stopped")
    }
}