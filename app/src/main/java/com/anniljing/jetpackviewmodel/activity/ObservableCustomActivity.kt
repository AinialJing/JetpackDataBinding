package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityObservableCustomBinding
import com.anniljing.jetpackviewmodel.databinding.ActivityObservableNormalBinding
import com.anniljing.jetpackviewmodel.model.CustomObservableUser
import com.anniljing.jetpackviewmodel.model.ObservableUser

class ObservableCustomActivity : AppCompatActivity() {
    private lateinit var binding: ActivityObservableCustomBinding
    private val observableUser = CustomObservableUser()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_custom)
        binding.user = observableUser
    }

    fun addLike(view: View) {
        observableUser.like=observableUser.like+ 1
        binding!!.currentLike.text = "当前点赞量：" + observableUser.like
    }
}