package com.gurpreet.singh.kotlinnavigationassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.ActivityBBinding
import com.gurpreet.singh.kotlinnavigationassignment.fragments.FragmentCArgs

class ActivityB : AppCompatActivity() {

    val args: FragmentCArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("valuespassed", args.stringPassed)

        var binding = DataBindingUtil.setContentView<ActivityBBinding>(this, R.layout.activity_b)

        findNavController(R.id.second_nav_host_fragment)
                .setGraph(R.navigation.navigation_graph_2,
                        ActivityBArgs(args.stringPassed, args.fragmentNo).toBundle()
                )
    }
}