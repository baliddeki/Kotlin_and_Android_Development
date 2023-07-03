package com.example.recyclerviews2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    /**
     * assign layout
     * create array lists
     * add items to array lists
     * create adapter class
     * create context variable specifying inner class as context
     * create inner class
     * create methods, onCreateViewHolder, getItemCount, onBindViewHolder
     * inflate layout in onCreateViewHolder
     * return array size in getItemCount
     * specify more operations in onBindViewHolder
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var contactName = ArrayList<String>()
        var contactIcon = ArrayList<Int>()
        var contactNumber = ArrayList<String>()
        setContentView(R.layout.activity_main)
        var phoneRecycler: RecyclerView = findViewById(R.id.phoneRecycler)

        phoneRecycler.layoutManager = LinearLayoutManager(this@MainActivity)

        contactName.add("Bryan")
        contactName.add("Joanne")
        contactName.add("Lynatte")
        contactName.add("Cynthia")
        contactName.add("Elisa")

        contactIcon.add(R.drawable.icon_1)
        contactIcon.add(R.drawable.icon_2)
        contactIcon.add(R.drawable.icon_3)
        contactIcon.add(R.drawable.icon_4)
        contactIcon.add(R.drawable.icon_2)

        contactNumber.add("0709903035")
        contactNumber.add("0761143643")
        contactNumber.add("0760026046")
        contactNumber.add("0751060675")
        contactNumber.add("0750068605")

        var adapter = ContactsAdapter(contactName, contactIcon, contactNumber, this@MainActivity)
        phoneRecycler.adapter = adapter




    }
}