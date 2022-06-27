package com.anniljing.jetpackviewmodel.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.FragmentShareDateOneBinding
import com.anniljing.jetpackviewmodel.model.Item
import com.anniljing.jetpackviewmodel.model.SharedViewModel

class ShareFragmentOne : Fragment() {
    private lateinit var binding: FragmentShareDateOneBinding
    private val model: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_share_date_one, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goToSecond.setOnClickListener {
            val item = Item("张三")
            model.select(item)
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_shareFragmentOne_to_shareFragmentTwo)
        }
    }
}