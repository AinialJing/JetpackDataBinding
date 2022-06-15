package com.anniljing.jetpackviewmodel.model

import androidx.databinding.ObservableInt

class ObservableBindingAdapterUser {
    var like: ObservableInt = ObservableInt(0)
        set(value) {
            field = value
        }
    var popularity: ObservableInt by ::like
}