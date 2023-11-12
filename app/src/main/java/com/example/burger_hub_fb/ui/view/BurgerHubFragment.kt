package com.example.burger_hub_fb.ui.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.burger_hub_fb.R
import com.example.burger_hub_fb.databinding.FragmentBurgerHubBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class BurgerHubFragment : Fragment(R.layout.fragment_burger_hub) {

    private val binding by lazy { FragmentBurgerHubBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}