package edu.utap.savant_pro_recreate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter() : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var list = mutableListOf<Room>()

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val roomName = v.findViewById<TextView>(R.id.roomName)
        val icon1 = v.findViewById<ImageView>(R.id.icon1)
        val icon2 = v.findViewById<ImageView>(R.id.icon2)
        val icon3 = v.findViewById<ImageView>(R.id.icon3)
        val icon4 = v.findViewById<ImageView>(R.id.icon4)
        val temp = v.findViewById<TextView>(R.id.temperatureText)

        fun bind(pos: Int) {
            var isSpaceCounter = false
            roomName.text = list[pos].name
            icon1.visibility = View.VISIBLE
            icon2.visibility = View.VISIBLE
            icon3.visibility = View.VISIBLE
            icon4.visibility = View.VISIBLE
            //https://stackoverflow.com/questions/12523005/how-set-background-drawable-programmatically-in-android
            when (list[pos].icon1) {
                0 -> { icon1.visibility = View.GONE
                        isSpaceCounter = true }
                1 -> icon1.setImageResource(R.drawable.ic_music_icon1_48)
                2 -> icon1.setImageResource(R.drawable.ic_remote_icon2_48)
                3 -> icon1.setImageResource(R.drawable.ic_videocam_icon3_48)
                4 -> icon1.setImageResource(R.drawable.ic_door_icon4_48)
            }
            when (list[pos].icon2) {
                0 -> { icon2.visibility = View.GONE
                    isSpaceCounter = true }
                1 -> icon2.setImageResource(R.drawable.ic_music_icon1_48)
                2 -> icon2.setImageResource(R.drawable.ic_remote_icon2_48)
                3 -> icon2.setImageResource(R.drawable.ic_videocam_icon3_48)
                4 -> icon2.setImageResource(R.drawable.ic_door_icon4_48)
            }
            when (list[pos].icon3) {
                0 -> { icon3.visibility = View.GONE
                    isSpaceCounter = true }
                1 -> icon3.setImageResource(R.drawable.ic_music_icon1_48)
                2 -> icon3.setImageResource(R.drawable.ic_remote_icon2_48)
                3 -> icon3.setImageResource(R.drawable.ic_videocam_icon3_48)
                4 -> icon3.setImageResource(R.drawable.ic_door_icon4_48)
            }
            when (list[pos].icon4) {
                0 -> { icon4.visibility = View.GONE
                    isSpaceCounter = true }
                1 -> icon4.setImageResource(R.drawable.ic_music_icon1_48)
                2 -> icon4.setImageResource(R.drawable.ic_remote_icon2_48)
                3 -> icon4.setImageResource(R.drawable.ic_videocam_icon3_48)
                4 -> icon4.setImageResource(R.drawable.ic_door_icon4_48)
            }
            if (isSpaceCounter) {
                temp.text = list[pos].temp
                temp.visibility = View.VISIBLE
            } else {
                temp.visibility = View.GONE
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun addAll(newList: List<Room>) {
        list.addAll(newList)
    }
}