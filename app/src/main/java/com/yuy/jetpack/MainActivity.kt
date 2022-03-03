package com.yuy.jetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yuy.jetpack.compose.ComposeLesson1Activity
import com.yuy.jetpack.datastore.PreferencesDemoActivity
import com.yuy.jetpack.viewbinding.ViewBindingTestActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.padding(all = 8.dp)) {
                Button(onClick = {
                    startActivity(Intent(this@MainActivity, ComposeLesson1Activity::class.java))
                }) {
                    Text(text = "ComposeDemo")
                }

                Box(modifier = Modifier.padding(all = 4.dp))

                Button(onClick = {
                    startActivity(Intent(this@MainActivity, PreferencesDemoActivity::class.java))
                }) {
                    Text(text = "PreferenceDemo")
                }

                Button(onClick = {
                    startActivity(Intent(this@MainActivity, ViewBindingTestActivity::class.java))
                }) {
                    Text(text = "ViewBindingDemo")
                }
            }
        }


    }
}

