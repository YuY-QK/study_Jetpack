package com.yuy.jetpack.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewStubProxy
import com.yuy.jetpack.databinding.ActivityViewbindingTestBinding
import com.yuy.jetpack.databinding.LayoutViewbindTest2Binding

/**
 * Created by yu on 2022/2/24.
 *
 */
class ViewBindingTestActivity: AppCompatActivity() {

    private lateinit var binding: ActivityViewbindingTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewbindingTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val vsp: ViewStubProxy = binding.vsTest2
        vsp.setOnInflateListener { stub, inflated ->
        }
        val binding2 = vsp.binding as LayoutViewbindTest2Binding
        binding2.btnTest2.setOnClickListener {
            binding2.btnTest2.text = "ViewStubsdddd"
        }
        binding.tvTitle.text = "张三"
    }



}