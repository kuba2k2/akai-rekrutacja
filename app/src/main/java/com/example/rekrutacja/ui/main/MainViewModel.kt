package com.example.rekrutacja.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
	companion object {
		private const val TAG = "MainViewModel"
	}

	var inputText = ""
	val textViewText = ObservableField<String>()
	var shouldNavigate = MutableLiveData<Long>()

	/* 1.   Pierwszym z zadań jest implementacja metody, w taki sposób, aby
            kliknięcie przycisku powodowało otwarcie activity SecondActivity, gdy
            wpisanym przez użytkownika tekstem jest 'AKAI'.
            Kolejne zadanie znajdziesz w pliku activity_main.xml.

            Podpowiedź poczytaj o Intent.
     */
	fun onButtonClick() {
		textViewText.set(inputText)
		if (inputText == "AKAI") {
			shouldNavigate.postValue(System.currentTimeMillis())
		}
	}

	/* 2.b  Druga część tego zadania polega na implementacji metody, która zmienia
            wszyskie literzy we wpisanym przez użytkownika tekscie na wielkie i
            wstawienie przerobionego tekstu do textView. Nie zapomnij dodać do metody
            OnCreate() OnClickListenera słuchającego na kliknięcia wstawionego przez Ciebie
            przycisku.
            Kolejne zadanie czeka na Ciebie w pliku SecondActivity
     */
	fun onClickMeClick() {
		textViewText.set(inputText.uppercase())
	}
}
