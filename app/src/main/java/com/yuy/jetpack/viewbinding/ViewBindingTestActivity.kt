package com.yuy.jetpack.viewbinding

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingConversion
import androidx.databinding.ViewStubProxy
import com.yuy.jetpack.databinding.ActivityViewbindingTestBinding
import com.yuy.jetpack.databinding.LayoutViewbindTest2Binding

/**
 * Created by yu on 2022/2/24.
 *
 */
class ViewBindingTestActivity: AppCompatActivity() {

    public lateinit var binding: ActivityViewbindingTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewbindingTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val vsp: ViewStubProxy = binding.vsTest2
        vsp.viewStub?.let {
            it.inflate()
            it.visibility = View.VISIBLE
        }
        val binding2 = (vsp.binding as LayoutViewbindTest2Binding)
        Log.e("TAG", "==========>>>${binding2.btnTest2.text}")
        binding2.btnTest2.setOnClickListener {
            Log.e("TAG", "==========>>>")
            binding2.btnTest2.text = "ViewStubsdddd"
        }

        // ViewStubProxy 允许您设置 OnInflateListener，它将在建立绑定后调用这个监听器。
        vsp.setOnInflateListener { stub, inflated ->
        }

        // 此时ViewStubProxy的binding为null
        Log.e("TAG", "=======>${vsp.binding}")
        binding.tvTitle.text = "新标题"

    }

    fun setBtnClick(view: View) {
        Log.e("TAG", "=======>setBtnClick")
        binding.isError = true

        binding.user = User().apply {
            this.firstName = "张三哟哟"
        }
    }


}