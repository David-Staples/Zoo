package com.example.zoo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.zoo.R
import com.example.zoo.model.ExhibitsName

class ExhibitsAdaptor(private val context: Context, private val exhibitsList: List<ExhibitsName>) : BaseAdapter() {

    override fun getExhibitsView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myView = LayoutInflater.from(context).inflate(
            R.layout.activity_exhibits,
            parent, false
        )

        val exhibitListName = myView.findViewById<TextView>(R.id.exhibitList)

        exhibitListName.text = exhibitsList[position].name

        return myView
    }

    override fun exhibitsName(position: Int): name {
        return exhibitsList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return exhibitsList.size
    }
}