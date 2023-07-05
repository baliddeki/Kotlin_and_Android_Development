package com.example.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobServiceEx: JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.i("service", "JOb intent started")
        Log.i("service", "Job intent thread: "+Thread.currentThread().name)

    }

    companion object{
        fun myBackgroundService(context: Context, intent:Intent){
            enqueueWork(context, JobServiceEx::class.java, 1, intent)



        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("service", "Job intent service destroyed")
    }
}