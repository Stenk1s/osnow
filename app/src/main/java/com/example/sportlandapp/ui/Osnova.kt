package com.example.sportlandapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.sportlandapp.R
import com.example.sportlandapp.databinding.ActivityOsnovaBinding
import com.example.sportlandapp.databinding.FragmentRegisterSreenBinding
import com.google.android.material.navigation.NavigationBarView

class Osnova : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.page_2 -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }

}