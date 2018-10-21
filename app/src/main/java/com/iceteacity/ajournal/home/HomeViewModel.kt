package com.iceteacity.ajournal.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class HomeViewModel : ViewModel() {

    val userName = MutableLiveData<String>()


    val currentDate: String
        get() {
            val formatter = SimpleDateFormat("E M dd hh:mma", Locale.CANADA)
            return formatter.format(Date())
        }

    val greeting: String get() = if (userName.value != null) "Hello ${userName.value}" else "Hello there"

}