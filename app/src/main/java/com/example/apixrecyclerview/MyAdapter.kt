package com.example.apixrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apixrecyclerview.databinding.ScrollsBinding

class MyAdapter(private val context: Context, private val userList: List<MyDataItem>)
    :RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    inner class ViewHolder(itemViewScrollsBinding: ScrollsBinding)
        :RecyclerView.ViewHolder(itemViewScrollsBinding.root)
    {

        var userId : TextView = itemViewScrollsBinding.tvTitle
        var textBody : TextView = itemViewScrollsBinding.tvBody

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemViewScrollsBinding = LayoutInflater.from(this.context)
            .inflate(R.layout.scrolls, parent, false)
        return ViewHolder(ScrollsBinding.bind(itemViewScrollsBinding))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.userId.text = userList[position].id.toString()
        holder.textBody.text = userList[position].body


    }

    override fun getItemCount(): Int {
        return userList.size

    }
}