package com.iceteacity.ajournal.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import java.util.*

inline fun <reified T : ViewModel> getViewModel(activity: FragmentActivity): T {
    return ViewModelProviders.of(activity)[T::class.java]
}

inline fun <reified T : ViewModel> getViewModel(fragment: Fragment): T {
    return ViewModelProviders.of(fragment)[T::class.java]
}

fun <E> List<E>.random(): E = get(Random().nextInt(size))
fun <E> MutableList<E>.generate(length: Int, predicate: (index: Int) -> E) {
    for (x in 0 until length) {
        add(predicate(x))
    }
}