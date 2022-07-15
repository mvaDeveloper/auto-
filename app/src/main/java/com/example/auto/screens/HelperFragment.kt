package com.example.auto.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.auto.R
import com.example.auto.databinding.FragmentHelperBinding


class HelperFragment : Fragment() {
    lateinit var binding: FragmentHelperBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHelperBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}