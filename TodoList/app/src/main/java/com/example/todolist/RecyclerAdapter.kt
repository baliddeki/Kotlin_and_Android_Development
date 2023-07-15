package com.example.todolist

import android.content.Context
import android.content.DialogInterface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    var addedToDo: ArrayList<String>,
    var context: Context

): RecyclerView.Adapter<RecyclerAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var cardView: CardView = itemView.findViewById(R.id.toDoCardView)
        var toDoTextView: TextView = itemView.findViewById(R.id.toDoTextView)
        var addButton: Button? = itemView.findViewById(R.id.addButton)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.to_do_card, parent, false)
        Log.d("RecyclerView", "Recycler View loaded successfully")
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return addedToDo.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        holder.toDoTextView.text = addedToDo.get(position)
        holder.cardView.setOnClickListener{
            var alertDialog = AlertDialog.Builder(context)
            alertDialog.setTitle("Delete activity")
                .setMessage("Do you really want to delete this activity")
                .setCancelable(false)
                .setNegativeButton("NO", DialogInterface.OnClickListener{
                    dialog, which -> dialog.cancel()
                })

                .setPositiveButton("YES", DialogInterface.OnClickListener{
                    dialog, which -> addedToDo.removeAt(position)
                    notifyDataSetChanged()

                    FileHandler().writeData(addedToDo, context)



                })
                .create().show()
        }

    }

}