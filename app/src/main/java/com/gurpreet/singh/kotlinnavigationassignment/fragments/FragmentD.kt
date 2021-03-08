package com.gurpreet.singh.kotlinnavigationassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentABinding
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentDBinding


class FragmentD : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var binding : FragmentDBinding
                = DataBindingUtil.inflate(inflater, R.layout.fragment_d, container, false)

        return binding.root
    }
}