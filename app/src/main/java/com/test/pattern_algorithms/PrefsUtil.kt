package com.test.pattern_algorithms

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {

    val PREFS_NAME = "MY_LOCAL_DATA"
    val COUNTER_CARS = "COUNTER_CARS"

    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);

    var counterCars: Int
        get() = prefs.getInt(COUNTER_CARS, 0)
        set(value) = prefs.edit().putInt(COUNTER_CARS, value).apply()
}