package com.yuy.jetpack.viewbinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.yuy.jetpack.BR

/**
 * Created by yu on 2022/3/8.
 *
 */
class User: BaseObservable() {

    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }
}