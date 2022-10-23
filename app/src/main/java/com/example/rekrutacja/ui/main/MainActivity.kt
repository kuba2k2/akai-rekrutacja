package com.example.rekrutacja.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.rekrutacja.databinding.MainActivityBinding
import com.example.rekrutacja.ui.base.BindingActivity

class MainActivity : BindingActivity<MainActivityBinding>(MainActivityBinding::inflate) {
    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = ViewModelProvider(this).get()
        b.vm = vm
    }
}
