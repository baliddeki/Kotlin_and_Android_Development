package com.example.mysmarthome

import FavoritesFragment
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mysmarthome.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val favoritesFragment = FavoritesFragment()
    private val thingsFragment = ThingsFragment()
    private var routinesFragment = RoutinesFragment()
    private val settingsFragment = SettingsFragment()
    private val ideasFragment = IdeasFragment()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(favoritesFragment)

        //val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        binding.bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.favFrag -> replaceFragment(favoritesFragment)
                R.id.thingFrag -> replaceFragment(thingsFragment)
                R.id.routineFrag -> replaceFragment(routinesFragment)
                R.id.settingFrag -> replaceFragment(settingsFragment)
                R.id.ideasFrag -> replaceFragment(ideasFragment)
            }
            true
        }

        val addBtn: FloatingActionButton? = findViewById<FloatingActionButton>(R.id.routine_addBtn)
        addBtn?.setOnClickListener{
            Intent(this, SelectRoutineActivity::class.java).also {
                startActivity(it)
            }
        }




    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment )
        transaction.commit()
    }



}
