package com.anniljing.jetpackviewmodel.util

import android.widget.ImageView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

@BindingMethods(value = [
    BindingMethod(
        type = ImageView::class,
        attribute = "tint",
        method = "setImageTintList")])
class BindingTintMethods {
}