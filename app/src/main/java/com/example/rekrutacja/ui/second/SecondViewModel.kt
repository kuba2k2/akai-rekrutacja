package com.example.rekrutacja.ui.second

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rekrutacja.R

class SecondViewModel : ViewModel() {
	companion object {
		private const val TAG = "SecondViewModel"
	}

	var imageVisible = ObservableField(true)
	val errorText = MutableLiveData<Int?>(null)

	/* 3.   Poniżej znajduje się kod, który obsługuje kliknięcia dwóch przycisków,
            jednak na wyświetlającym się widoku nie są one podpisane. Twoim
            zadaniem jest wywnioskowanie co kliknięcie na poszczególny przycisk zmienia
            i adekwatne podpisanie tych przycisków w pliku activity_second.xml.
            Kolejne zadanie znajduje się poniżej.

            Podpisanie - chodzi o android:text.
     */
	fun onFirstClick() {
		if (imageVisible.get() == false) {
			errorText.postValue(R.string.error_image_hidden)
			return
		}
		imageVisible.set(false)
	}

	fun onSecondClick() {
		if (imageVisible.get() == true) {
			errorText.postValue(R.string.error_image_shown)
			return
		}
		imageVisible.set(true)
	}

	fun onToggleClick() {
		imageVisible.set(imageVisible.get() != true) // get() is nullable
	}

	/* 4.   W tym activity znajduje się jeszcze jeden przycisk niestety kliknięcie
            na niego nic nie robi. Twoim zadaniem jest implementacja kliknięcia w taki sposób,
            aby jak obrazek jest widoczy przycisk chował obrazek, w przeciwnym wypadku,
            gdy obrazek jest schowany po kliknięciu obrazek ma się pojawić. Dodatkowo należy
            przerobić listenery poprzednich obrazków tak, aby np. Klikając na przycisk do chowania
            obrazka, chował on obrazek, a w przypadku kliknięcia, gdy obrazek jest niewidoczny
            wyświetlał informację o tym, obrazek jest już niewidoczny (np. za pomocą Toast lub
            SnackBar lub AlertDialog). Podobnie dla drugiego przycisku odpowiedzialnego za
            wyświetlanie obrazka. Jednocześnie zmień widok tego przycisku tak, aby nie wszystkie
            litery, były pisane wielką literą.
            Kolejne zadanie znajduje się poniżej.
     */

	/* 5.   Ostatnie zadanie polega na dodaniu przycisku pozwalającego na przejście spowrotem
			do MainActivity. Tutaj jednak nie chcemy, abyś otwierał nowe activity, tylko po
			kliknięcku przycisku zamknął aktualne, ponieważ pod aktualnie wyświetlanym activity
			jest już instancja MainActivity.

	 */

	/* TODO Zadanie Dodatkowe. Tutaj masz zupełną dowolność, jeśli masz jeszcze czas
			i ochotę zrób coś kreatywnego, ale jednocześnie prostego,
			pamiętaj jednak, aby nie naruszyć tym kodu,
			który realizuje poprzednich zadań. Nie jest to zadanie obowiązkowe.
	 */
}
