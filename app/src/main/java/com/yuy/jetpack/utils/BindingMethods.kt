package com.yuy.jetpack.utils

import android.widget.ImageView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

/**
 * Created by yu on 2022/3/8.
 *
 */
@BindingMethods(
    BindingMethod(type = ImageView::class,
        attribute = "srcCompat",    //如果写成："app:srcCompat"，则报警告（但能运行）Application namespace for attribute app:srcCompat will be ignored.
        method = "setImageResource"
    ))
class MyBindingMethods