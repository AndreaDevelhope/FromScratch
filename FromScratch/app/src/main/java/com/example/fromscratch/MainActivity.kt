package com.example.fromscratch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fromscratch.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNavigationView.setupWithNavController(navController)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        val items = listOf(
            ItemData(R.drawable.baseline_call_24, R.string.second_activity),
            ItemData(R.drawable.baseline_child_friendly_24, R.string.first_fragment),
            ItemData(R.drawable.baseline_beach_access_24, R.string.text_edit)
        )
        binding.recyclerview.adapter = ListAdapter(items)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.fragment_first -> {
                Toast.makeText(this,"To be implemented", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.fragment_second -> {
                Toast.makeText(this,"To be implemented", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.fragment_third -> {
                Toast.makeText(this,"To be implemented", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}