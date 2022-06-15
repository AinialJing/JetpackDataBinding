package com.anniljing.jetpackviewmodel.util

import android.content.Context
import android.content.res.ColorStateList
import android.util.Log
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R

object BindingMergeAdapters {
    @BindingAdapter("mergeTintAndSrc")
    @JvmStatic fun mergeTintAndSrc(imageView: ImageView, mergeType: ObservableInt){
        val context:Context=imageView.context
        imageView.setImageResource(R.drawable.ic_whatshot_black_96dp)
        if (mergeType.get() in 5..8){
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.popular)))
        }else if (mergeType.get()>9){
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.star)))
        }
    }
}