package com.anniljing.jetpackviewmodel.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityNormalBinding
import com.anniljing.jetpackviewmodel.model.User

class NormalActivity : AppCompatActivity() {
    private var binding:ActivityNormalBinding ?=null
    private val user=User("张三","李四")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_normal)
        user.like=1
        binding!!.user=user
    }

    fun addLike(view: View) {
         user.like=user.like+1
         binding!!.currentLike.text="当前点赞量："+user.like
    }
}