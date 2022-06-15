package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityObservableBindingAdapterBinding
import com.anniljing.jetpackviewmodel.model.ObservableBindingAdapterUser

class ObservableBindingAdapterActivity : AppCompatActivity() {
    private val observableUser: ObservableBindingAdapterUser by lazy {
        ObservableBindingAdapterUser()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityObservableBindingAdapterBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_binding_adapter)
        binding.user = observableUser
    }

    fun addLike(view: View) {
        observableUser.like.set(observableUser.like.get() + 1)
    }

}