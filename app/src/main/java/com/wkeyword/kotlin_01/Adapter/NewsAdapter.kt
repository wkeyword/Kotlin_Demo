package com.wkeyword.kotlin_01.Adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * News Adapter
 */

class NewsAdapter(val items: List<String>) : RecyclerView.Adapter<NewsAdapter.viewHolder>(){
    override fun onBindViewHolder(holder: viewHolder?, position: Int) {
        holder?.textView?.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): viewHolder {
        return viewHolder(TextView(parent?.context))
    }


    class viewHolder(val textView:TextView) : RecyclerView.ViewHolder(textView) {

    }
}
