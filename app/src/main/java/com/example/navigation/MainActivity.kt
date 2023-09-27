package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            var inputA = binding.editTextUsername.text.toString().toInt()
            var inputB = binding.editTextPassword.text.toString().toInt()
            var hasil = hitung(inputA , inputB)
            binding.textView.setText(hasil.toString())
        }
    }

    fun hitung(a : Int , b : Int): Int{
        return a + b
    }
}