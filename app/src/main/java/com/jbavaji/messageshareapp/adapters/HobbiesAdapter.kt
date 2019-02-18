package com.jbavaji.messageshareapp.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jbavaji.messageshareapp.R
import com.jbavaji.messageshareapp.extensions.showToast
import com.jbavaji.messageshareapp.models.Hobby
import kotlinx.android.synthetic.main.list_item.view.*


/**
 * Created by Jayeshgiri Bavaji on 2/18/2019.
 * Synechron Technologies
 * jayeshgiri.bavaji@synechron.com
 */

class HobbiesAdapter(val context: Context, private val hobbies: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.bindUI(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentHobby: Hobby? = null
        var currentPos: Int = 0

        init {
            itemView.setOnClickListener {
                (currentHobby?.let {
                    context.showToast(currentHobby!!.title + " clicked")
                })
            }

            itemView.imgShare.setOnClickListener {
                currentHobby?.let {
                    val message: String = "My hobby is " + currentHobby!!.title

                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Please Select Share App - "))
                }
            }
        }

        fun bindUI(hobby: Hobby, position: Int) {
            currentPos = position
            currentHobby = hobby
            currentHobby?.let {
                itemView.txtTitle.text = currentHobby!!.title
            }
        }

    }
}