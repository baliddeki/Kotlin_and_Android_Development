package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    var context: Context,
    var imageList: ArrayList<Int>,
    var imageDecList: ArrayList<String>
) : BaseAdapter() {

    override fun getCount(): Int {
        return imageList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(parent!!.context).inflate(R.layout.photo_display, parent, false)
        var photoDec: TextView = view.findViewById(R.id.ImageTextView)
        var photo : ImageView = view.findViewById(R.id.ImageView)

        photoDec.text = imageDecList.get(position)
        photo.setImageResource(imageList.get(position))

        return view
    }
}