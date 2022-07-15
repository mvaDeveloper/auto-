package com.example.auto.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.auto.MAIN
import com.example.auto.R

import com.example.auto.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {
    lateinit private var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonHelper.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_helperFragment)
        }
    }

}