package com.example.mysmarthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.mysmarthome.AddActionRoutinesFragment
import com.example.mysmarthome.AddActionScenesFragment
import com.example.mysmarthome.FragmentAdapter
import com.example.mysmarthome.R
import com.google.android.material.tabs.TabLayout


class  AddActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_action)

        setUpTabs()
    }
        private fun setUpTabs(){
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.AddActionTabLayout)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(AddActionThingsFragment(), "THINGS")
        fragmentAdapter.addFragment(AddActionScenesFragment(), "SCENES")
        fragmentAdapter.addFragment(AddActionRoutinesFragment(), "ROUTINES")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }



}
