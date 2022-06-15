package com.anniljing.jetpackviewmodel.util

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.model.Popularity

object BindingAdapters {
    @BindingAdapter("srcCompat")
    @JvmStatic
    fun srcCompat(view: ImageView, @DrawableRes drawableId: Int) {
        view.setImageResource(drawableId)
    }

    @BindingAdapter("popularityIcon")
    @JvmStatic fun popularityIcon(view: ImageView, popularity: Popularity) {

        val color = getAssociatedColor(popularity, view.context)

        ImageViewCompat.setImageTintList(view, ColorStateList.valueOf(color))

        view.setImageDrawable(getDrawablePopularity(popularity, view.context))
    }

    private fun getAssociatedColor(popularity: Popularity, context: Context): Int {
        return when (popularity) {
            Popularity.NORMAL -> context.theme.obtainStyledAttributes(
                intArrayOf(android.R.attr.colorForeground)).getColor(0, 0x000000)
            Popularity.POPULAR -> ContextCompat.getColor(context, R.color.popular)
            Popularity.STAR -> ContextCompat.getColor(context, R.color.star)
        }
    }

    private fun getDrawablePopularity(popularity: Popularity, context: Context): Drawable? {
        return when (popularity) {
            Popularity.NORMAL -> {
                ContextCompat.getDrawable(context, R.drawable.ic_person_black_96dp)
            }
            Popularity.POPULAR -> {
                ContextCompat.getDrawable(context, R.drawable.ic_whatshot_black_96dp)
            }
            Popularity.STAR -> {
                ContextCompat.getDrawable(context, R.drawable.ic_whatshot_black_96dp)
            }
        }
    }
}