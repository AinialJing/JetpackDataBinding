package com.anniljing.jetpackviewmodel.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityObserverableBinding
import com.anniljing.jetpackviewmodel.model.ObservableUser

class ObservableActivity : AppCompatActivity() {
    private val observableUser = ObservableUser("张三", ObservableInt(0))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityObserverableBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observerable)
        binding.user = observableUser
    }

    fun onLike(view: View) {
        observableUser.like.set(observableUser.like.get() + 1)
    }
}