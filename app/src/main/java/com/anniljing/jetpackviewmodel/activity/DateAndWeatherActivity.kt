package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityDateWeatherBinding
import com.anniljing.jetpackviewmodel.model.DateWeatherVMFactory
import com.anniljing.jetpackviewmodel.model.DateWeatherViewModel

/**
 * 使用viewModels需要添加 implementation "androidx.activity:activity-ktx:1.4.0"
 */
class DateAndWeatherActivity : AppCompatActivity() {
    private val viewmodel: DateWeatherViewModel by viewModels {
        DateWeatherVMFactory
    }
    private lateinit var binding: ActivityDateWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_date_weather)
        binding.lifecycleOwner = this
        binding.viewmodel = viewmodel
    }
}