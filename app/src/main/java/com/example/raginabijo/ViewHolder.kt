package com.example.raginabijo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val levelTextView : TextView
    val questionImage : ImageView

    init {
        levelTextView = view.findViewById(R.id.levelTextView)
        questionImage = view.findViewById(R.id.levelImageView)
    }
}