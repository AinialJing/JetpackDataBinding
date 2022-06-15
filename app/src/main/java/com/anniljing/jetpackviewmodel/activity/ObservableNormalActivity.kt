package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityObservableNormalBinding
import com.anniljing.jetpackviewmodel.model.ObservableUser

class ObservableNormalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityObservableNormalBinding
    private val observableUser = ObservableUser("张三", ObservableInt(0))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_normal)
        binding.user = observableUser
    }

    fun addLike(view: View) {
        observableUser.like.set(observableUser.like.get() + 1)
        binding!!.currentLike.text = "当前点赞量：" + observableUser.like.get()
    }
}