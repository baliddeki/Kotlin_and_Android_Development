package com.example.recyclerviews2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class ContactsAdapter(
    var contactName: ArrayList<String>,
    var contactIcon: ArrayList<Int>,
    var contactNumber: ArrayList<String>,
    var context: Context):RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>()
{
    class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var contactNameView: TextView = itemView.findViewById(R.id.contactNameView)
        var contactIconView: ImageView = itemView.findViewById(R.id.contactIconView)
        var contactNumber: TextView = itemView.findViewById(R.id.contactNumberView)
        var contactCardView: CardView = itemView.findViewById(R.id.contactCardView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_card, parent, false)
        return ContactsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactName.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        holder.contactNameView.text = contactName.get(position)
        holder.contactIconView.setImageResource(contactIcon.get(position))
        holder.contactNumber.text = contactNumber.get(position)
        holder.contactCardView.setOnClickListener{
            val intent = Intent(context, ContactDetailsActivity::class.java )
            context.startActivity(intent)

        }
    }
}