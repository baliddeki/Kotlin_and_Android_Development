package com.example.lifecycles

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment", "onAttach() called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment", "onCreate() called")

    }   
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        Log.i("Fragment", "onViewCreated() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment", "onStop() called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment", "onDestroyView() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment", "onDestroy() called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment", "onDetach() called")
    }

}