package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityObservableBindingMethodsBinding
import com.anniljing.jetpackviewmodel.model.ObservableUser

class ObservableBindingMethodsActivity : AppCompatActivity() {
    private val user: ObservableUser by lazy {
        ObservableUser("张三", ObservableInt(2))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityObservableBindingMethodsBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_binding_methods)
        binding.user = user
    }

    fun addLike(view: View) {
        user.like.set(user.like.get() + 1)
    }

}