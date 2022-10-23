package com.example.rekrutacja.ui.main

import android.os.Bundle
import com.example.rekrutacja.databinding.MainActivityBinding
import com.example.rekrutacja.onClick
import com.example.rekrutacja.ui.base.BindingActivity

class MainActivity : BindingActivity<MainActivityBinding>(MainActivityBinding::inflate) {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b.button.onClick(this::onButtonClick)
    }

    /*1.TODO Pierwszym z zadań jest implementacja metody, w taki sposób, aby
            kliknięcie przycisku powodowało otwarcie activity SecondActivity, gdy
            wpisanym przez użytkownika tekstem jest 'AKAI'.
            Kolejne zadanie znajdziesz w pliku activity_main.xml.

            Podpowiedź poczytaj o Intent.
     */
    private fun onButtonClick() {
        b.textView.text = b.editText.text.toString()
    }

    /*2.b TODO Druga część tego zadania polega na implementacji metody, która zmienia
            wszyskie literzy we wpisanym przez użytkownika tekscie na wielkie i
            wstawienie przerobionego tekstu do textView. Nie zapomnij dodać do metody
            OnCreate() OnClickListenera słuchającego na kliknięcia wstawionego przez Ciebie
            przycisku.
            Kolejne zadanie czeka na Ciebie w pliku SecondActivity
     */
    private fun onYourButtonClick() {

    }
}
