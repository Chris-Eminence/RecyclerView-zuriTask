package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ActivityMainBinding
import com.example.contactlist.databinding.ContactItemBinding

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    private val contacts = mutableListOf<ContactList>()

    fun setUpContacts(contact: List<ContactList>){
        this.contacts.addAll(contacts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(ContactItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bindItem(contact)
    }

    inner class ContactViewHolder(private val binding: ContactItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindItem(contact: ContactList){
            binding.contactName.text = contact.name
            binding.contactNumber.text = contact.number
        }
    }
}