package com.example.mysmarthome

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter (fragManager:  FragmentManager): FragmentStatePagerAdapter(fragManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

   var fragmentList : ArrayList <Fragment> = ArrayList()

    var fragmentTitle : ArrayList <String> = ArrayList()




    override fun getItem(position: Int): Fragment {
        return fragmentList[position]

    }

    override fun getCount(): Int {
        return fragmentList.size

    }



    override fun getPageTitle(position: Int): CharSequence?{
        return fragmentTitle[position]
    }

    fun addFragment(fragment: Fragment, title:String){
        fragmentList.add(fragment)
        fragmentTitle.add(title)
    }

}



