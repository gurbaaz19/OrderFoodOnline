package com.example.orderfoodonline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter( var todos: List<Rvhold>): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>()
{

    inner class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.singlelist , parent , false)
        return(ToDoViewHolder(view))
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.txtqty).text = todos[position].quantity.toString()
            findViewById<ImageView>(R.id.orderv).setImageResource(imgarr[position])
        //image addition}
        }

    }

    override fun getItemCount(): Int {
      return(todos.size)
    }

}