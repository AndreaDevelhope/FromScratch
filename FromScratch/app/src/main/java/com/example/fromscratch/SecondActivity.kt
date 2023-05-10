package com.example.fromscratch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.fromscratch.databinding.ActivitySecondBinding
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSecondActivity.setOnClickListener {
            Toast.makeText(this,"To be implemented", Toast.LENGTH_SHORT).show()
        }
        binding.editText.setOnClickListener{
            binding.toolbarTitle.text = binding.textSecondActivity.text
            Snackbar.make(binding.editText, binding.textSecondActivity.text, Snackbar.LENGTH_SHORT).show()
        }
//        binding.buttonSecondActivity.setOnClickListener{
//            findNavController(R.id.nav_host_fragment).navigate(R.id.action_secondFragment_to_firstFragment)
//        }
    }


}