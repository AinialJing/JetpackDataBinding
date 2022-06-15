package com.anniljing.jetpackviewmodel.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR


class CustomObservableUser : BaseObservable() {
    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var like: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.like)
        }
}