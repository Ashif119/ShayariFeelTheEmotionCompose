package com.itandcstech.shayarifeeltheemotion.util

import android.content.Context
import androidx.core.content.edit

/**
 * @Created by Ashif on 12-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
class PreferenceManager(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    fun isFirstTime(): Boolean {
        return sharedPreferences.getBoolean("isFirstTime", true)
    }

    fun setFirstTimeCompleted(){
        sharedPreferences.edit { putBoolean("isFirstTime", false) }
    }
}