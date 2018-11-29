package com.jalilurrahman.audioplayerkotlin

import android.support.annotation.NonNull
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jalilurrahman.audioplayerkotlin.R
import kotlinx.android.synthetic.main.item_layout.view.*

class RecyclerViewAdapter(
    private val videoList: List<Audio>,
    private val itemClick: (Int) -> Unit
) : RecyclerView.Adapter<RecyclerViewAdapter.VideoListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoListViewHolder =
        VideoListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        )

    override fun onBindViewHolder(@NonNull holder: VideoListViewHolder, position: Int) {
        val item = videoList[position]
        val itemView = holder.itemView

        itemView.title.text = item.title

        itemView.setOnClickListener { itemClick(position) }
    }

    override fun getItemCount(): Int = videoList.size

    class VideoListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}