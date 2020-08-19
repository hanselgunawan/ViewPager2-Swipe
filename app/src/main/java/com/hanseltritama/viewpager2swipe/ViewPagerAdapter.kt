package com.hanseltritama.viewpager2swipe

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val context: Context) : RecyclerView.Adapter<ViewPagerAdapter.MyViewHolder>() {

    private val matrixIconColor = arrayOf<IntArray>(
        intArrayOf(android.R.color.holo_red_dark, R.drawable.ic_account),
        intArrayOf(android.R.color.holo_blue_dark, R.drawable.ic_monetization),
        intArrayOf(android.R.color.holo_green_dark, R.drawable.ic_directions_car),
        intArrayOf(android.R.color.holo_orange_dark, R.drawable.ic_location)
    )

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgView: ImageView
        val container: RelativeLayout

        init {
            imgView = itemView.findViewById(R.id.img_view)
            container = itemView.findViewById(R.id.container)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_page, parent,false))
    }

    override fun getItemCount(): Int {
        return matrixIconColor.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.container.setBackgroundResource(matrixIconColor[position][0]) // 0 is color column
        holder.imgView.setImageResource(matrixIconColor[position][1]) // 1 is drawable column
    }


}