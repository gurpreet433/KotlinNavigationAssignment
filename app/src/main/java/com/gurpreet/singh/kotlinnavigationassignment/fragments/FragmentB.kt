package com.gurpreet.singh.kotlinnavigationassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentBBinding

class FragmentB : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var binding : FragmentBBinding
                    = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false)

        binding.buttonGoToFragmentD.setOnClickListener(View.OnClickListener { view: View ->
            var direction: NavDirections
                = FragmentBDirections.actionFragmentBToActivityB("hello from Fragment B(ActivityA)", 2)
            findNavController().navigate(direction)
        })
        return binding.root
    }
}