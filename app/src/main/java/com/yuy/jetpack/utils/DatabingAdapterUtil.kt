package com.yuy.jetpack.utils

import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion

/**
 * Created by yu on 2022/3/7.
 *
 */
object DatabingAdapterUtil {

    @BindingConversion
    @JvmStatic
    fun convertColorToDrawable(color: Int) = ColorDrawable(color)


}