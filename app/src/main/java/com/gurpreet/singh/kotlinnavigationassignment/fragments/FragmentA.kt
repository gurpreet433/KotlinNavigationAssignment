package com.gurpreet.singh.kotlinnavigationassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentABinding


class FragmentA : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var binding: FragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)


        binding.buttonGoToFragmentB.setOnClickListener(View.OnClickListener { view: View ->
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        })

        binding.buttonGoToFragmentC.setOnClickListener(View.OnClickListener { view: View ->
            var direction: NavDirections
            = FragmentADirections.actionFragmentAToActivityB("hello From FragmentA (ActivityA)", 1)
            findNavController().navigate(direction)
        })

    return binding.root
}

}