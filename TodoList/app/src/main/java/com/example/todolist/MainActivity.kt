package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var fileHandler = FileHandler()

    private lateinit var addButton: Button
    private lateinit var toDoEditText: EditText
    private lateinit var addedToDo: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mainBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        addButton = mainBinding.addButton
        addedToDo = ArrayList()

        addedToDo = fileHandler.readData(this)


        val listRecycler: RecyclerView = findViewById(R.id.recyclerView)
        listRecycler.layoutManager = LinearLayoutManager(this@MainActivity)
        val adapter = RecyclerAdapter(addedToDo, this@MainActivity)
        listRecycler.adapter = adapter

        addButton.setOnClickListener{
            toDoEditText = findViewById(R.id.toDoEdit)
            var itemName: String = toDoEditText.text.toString()
            addedToDo.add(itemName)
            toDoEditText.setText("")
            fileHandler.writeData(addedToDo, applicationContext)
            adapter.notifyDataSetChanged()

        }


    }
}
