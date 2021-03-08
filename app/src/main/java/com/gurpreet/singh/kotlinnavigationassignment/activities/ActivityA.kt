package com.gurpreet.singh.kotlinnavigationassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = DataBindingUtil.setContentView<ActivityABinding>(this, R.layout.activity_a)

        findNavController(R.id.first_nav_host_fragment)
                .setGraph(R.navigation.navigation_graph_1, intent.extras)
    }
}