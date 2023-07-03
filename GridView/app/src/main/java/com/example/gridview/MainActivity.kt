package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gridView: GridView
        var imageList = ArrayList<Int>()
        var imageDecList = ArrayList<String>()

        gridView = findViewById(R.id.GridView)

        imageList.add(R.drawable.image1)
        imageList.add(R.drawable.image_3)
        imageList.add(R.drawable.image_4)
        imageList.add(R.drawable.image_5)
        imageList.add(R.drawable.image_6)
        imageList.add(R.drawable.image_7)
        imageList.add(R.drawable.image_8)
        imageList.add(R.drawable.image_9)
        imageList.add(R.drawable.image_10)
        imageList.add(R.drawable.image2)

        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")
        imageDecList.add("This is me")

        var adapter = GridAdapter(this, imageList, imageDecList)
        gridView.adapter = adapter


    }
}