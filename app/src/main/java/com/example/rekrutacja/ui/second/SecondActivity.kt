package com.example.rekrutacja.ui.second

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.rekrutacja.databinding.SecondActivityBinding
import com.example.rekrutacja.onClick
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

        vm.errorText.observe(this) {
            Toast.makeText(this, getString(it ?: return@observe), Toast.LENGTH_SHORT).show()
        }

        b.backButton.onClick {
            finish()
        }
    }
}
