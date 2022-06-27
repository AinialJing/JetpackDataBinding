package com.anniljing.jetpackviewmodel.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.anniljing.jetpackviewmodel.R
import com.anniljing.jetpackviewmodel.databinding.FragmentShareDateTwoBinding
import com.anniljing.jetpackviewmodel.model.Item
import com.anniljing.jetpackviewmodel.model.SharedViewModel

class ShareFragmentTwo : Fragment() {
    private lateinit var binding: FragmentShareDateTwoBinding
    private val model: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_share_date_two, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         model.selected.observe(viewLifecycleOwner, Observer<Item> {
            t: Item -> binding.tvTwo.text=t.name
         })
    }
}