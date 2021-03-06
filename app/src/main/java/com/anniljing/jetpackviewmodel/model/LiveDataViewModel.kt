package com.anniljing.jetpackviewmodel.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
    val _name = MutableLiveData("张三")
    val _lastName = MutableLiveData("李四")
    val _likes =  MutableLiveData(0)

//    val name: LiveData<String> = _name
//    val lastName: LiveData<String> = _lastName
//    val likes: LiveData<Int> = _likes

    // popularity is exposed as LiveData using a Transformation instead of a @Bindable property.
    val popularity: LiveData<Popularity> = Transformations.map(_likes) {
        when {
            it > 9 -> Popularity.STAR
            it > 4 -> Popularity.POPULAR
            else -> Popularity.NORMAL
        }
    }

    fun onLike() {
        _likes.value = (_likes.value ?: 0) + 1
    }
}

enum class Popularity {
    NORMAL,
    POPULAR,
    STAR
}