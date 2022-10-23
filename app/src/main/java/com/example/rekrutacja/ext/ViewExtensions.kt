package com.example.rekrutacja

import android.view.View

fun <V : View> V.onClick(block: () -> Unit) {
	this.setOnClickListener {
		block()
	}
}
