package com.example.rekrutacja.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BindingActivity<B : ViewBinding>(
	private val inflater: (inflater: LayoutInflater) -> B,
) : AppCompatActivity() {

	protected lateinit var b: B

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		b = inflater(layoutInflater)
		setContentView(b.root)
	}
}
