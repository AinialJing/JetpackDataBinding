package com.anniljing.jetpackviewmodel.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.ActivityMainBinding
import com.anniljing.jetpackviewmodel.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    fun jumpToObservable(view: View) {
        startActivity(Intent(this, ObservableBindingAdapterActivity::class.java))
    }

    fun jumpToNormal(view: View) {
        startActivity(Intent(this, NormalActivity::class.java))
    }

    fun jumpToLiveData(view: View) {
        startActivity(Intent(this, ViewModelActivity::class.java))
    }

    fun jumpToLiveDataAndViewModel(view: View) {
        startActivity(Intent(this, DateAndWeatherActivity::class.java))
    }

    fun jumpToShareActivity(view: View) {
        startActivity(Intent(this, ShareDataBetweenFragmentsActivity::class.java))
    }
}