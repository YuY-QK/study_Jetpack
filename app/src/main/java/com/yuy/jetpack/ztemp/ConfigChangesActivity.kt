package com.yuy.jetpack.ztemp

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by yu on 2022/3/3.
 *
 */
class ConfigChangesActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG", "===========onCreate++1")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.e("TAG", "===========onCreate++2")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG", "===========onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "===========onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("TAG", "===========onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG", "===========onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG", "===========onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "===========onDestroy")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.e("TAG", "===========onConfigurationChanged::${newConfig.orientation}")

    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.e("TAG", "===========onPostCreate")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.e("TAG", "===========onPostResume")
    }

}