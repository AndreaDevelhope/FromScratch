package com.example.fromscratch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fromscratch.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonThirdFragmentPrevious.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }

}