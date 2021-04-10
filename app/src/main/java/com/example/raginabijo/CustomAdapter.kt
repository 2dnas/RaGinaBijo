package com.example.raginabijo

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_row_item.view.*
import kotlin.math.log

class CustomAdapter(private val dataSet : ArrayList<String>, context: Context) :
        RecyclerView.Adapter<ViewHolder>(){
    private val LEVEL_COMPLETION = "level_completion"
    private val LEVEL_EXTRA = "level"
    private val LEVEL_POSITION = "level_position"

    val sharedPreferences = context.applicationContext.getSharedPreferences(LEVEL_COMPLETION,Context.MODE_PRIVATE)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = holder.itemView
        item.isEnabled = false
        item.card_linearLayout.setBackgroundColor(Color.GRAY)
        if(position == 0){
            holder.questionImage.setImageResource(R.drawable.unlocked_padlock)
            item.isEnabled = true
            item.card_linearLayout.setBackgroundColor(Color.LTGRAY)
        }

        if(sharedPreferences.contains("level 1") && position == 1){
            holder.questionImage.setImageResource(R.drawable.unlocked_padlock)
            item.isEnabled = true
            item.card_linearLayout.setBackgroundColor(Color.LTGRAY)
        }
        if(sharedPreferences.contains("level 2") && position == 2){
            holder.questionImage.setImageResource(R.drawable.unlocked_padlock)
            item.isEnabled = true
            item.card_linearLayout.setBackgroundColor(Color.LTGRAY)
        }

        if(sharedPreferences.contains("level 3") && position == 3){
            holder.questionImage.setImageResource(R.drawable.unlocked_padlock)
            item.isEnabled = true
            item.card_linearLayout.setBackgroundColor(Color.LTGRAY)
        }
        if(sharedPreferences.contains("level 4") && position == 4){
            holder.questionImage.setImageResource(R.drawable.unlocked_padlock)
            item.isEnabled = true
            item.card_linearLayout.setBackgroundColor(Color.LTGRAY)
        }

        holder.levelTextView.text = dataSet[position]
        holder.itemView.setOnClickListener{view ->
            val intent : Intent = Intent(view.context,QuestionsActivity::class.java)
            intent.putExtra(LEVEL_EXTRA,holder.levelTextView.text.toString())
            intent.putExtra(LEVEL_POSITION,position)
            view.context.startActivity(intent)
        }
    }



    override fun getItemCount() = dataSet.size
}
