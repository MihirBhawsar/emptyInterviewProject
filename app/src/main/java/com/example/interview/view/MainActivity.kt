package com.example.interview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.interview.ClickListener.OnClickListener

import com.example.interview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding


    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onClick() {
        TODO("Not yet implemented")
    }


}