package com.example.rewardsdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.rewardsdemo.R
import com.example.rewardsdemo.databinding.LoginSuccessFragmentBinding
import com.example.rewardsdemo.viewmodel.LoginSuccessViewModel

class LoginSuccessFragment : Fragment() {

    private lateinit var Login: LoginSuccessViewModel
    private lateinit var binding: LoginSuccessFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.login_success_fragment, container, false
        )

        return binding.root

    }

}