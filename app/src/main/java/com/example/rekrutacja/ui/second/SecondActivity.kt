package com.example.rekrutacja.ui.second

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.rekrutacja.databinding.SecondActivityBinding
import com.example.rekrutacja.ui.base.BindingActivity

class SecondActivity : BindingActivity<SecondActivityBinding>(SecondActivityBinding::inflate) {
    companion object {
        private const val TAG = "SecondActivity"
    }

    private lateinit var vm: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = ViewModelProvider(this).get()
        b.vm = vm
    }
}
