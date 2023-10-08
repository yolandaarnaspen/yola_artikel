package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class Fragment_1 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutIater)
        setContentView(binding.root)

        binding.betnFragment1.setOnclickListener { replaceFragment(Fragment_1()) }
        binding.betnFragment1.setOnclickListener { replaceFragment(Fragment_2()) }
    }
    private fun replaceFragment(fragment: Fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(androidx.fragment.R.id.fragment_container_view_tag, fragment)
        fragmentTransaction.commit()
    }
}