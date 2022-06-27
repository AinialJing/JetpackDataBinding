package com.anniljing.jetpackviewmodel.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anniljing.jetpackviewmodel.R

/**
 * navigation不是一定和BottomNavigationView一起使用
 */
class ShareDataBetweenFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_data_between_fragments)
    }
}