package com.anniljing.jetpackviewmodel.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityViewmodelBinding
import com.anniljing.jetpackviewmodel.model.LiveDataViewModel

class ViewModelActivity : AppCompatActivity() {
    private lateinit var binding:ActivityViewmodelBinding
    private val viewModel by lazy {
        ViewModelProvider(this).get(LiveDataViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_viewmodel)
        binding.user = viewModel
        binding.lifecycleOwner = this
    }
}