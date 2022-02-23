package com.yuy.jetpack.datastore

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Created by yu on 2022/2/23.
 *
 */
class PreferencesDemoActivity : AppCompatActivity() {


    private val PREFERENCE_NAME = "settings"
    val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_NAME)
    val EXAMPLE_COUNTER = intPreferencesKey("example_counter")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val exampleConter : Flow<Int> = dataStore.data
            .map { preferences ->
                preferences[EXAMPLE_COUNTER] ?: 0

            }
    }

    suspend fun incrementCounter() {
        dataStore.edit { setting ->
            val currentCounter = setting[EXAMPLE_COUNTER] ?: 0
            setting[EXAMPLE_COUNTER] = currentCounter + 1

        }
    }

}