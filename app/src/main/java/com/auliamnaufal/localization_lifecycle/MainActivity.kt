package com.auliamnaufal.localization_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.auliamnaufal.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
//    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.i("Activity", "onCreate invoked")
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity", "onStart invoked")
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity", "onResume invoked")
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity", "onPause invoked")
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity", "onStop invoked")
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity", "onDestroy invoked")
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}