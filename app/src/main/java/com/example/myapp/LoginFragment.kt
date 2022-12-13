package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_sreen, container, false)

        val buttonGoogle = view.findViewById<TextView>(R.id.tv_signAccount)
        buttonGoogle.setOnClickListener{
            findNavController().navigate(R.id.action_loginSreen_to_recycleView)
        }
        return view
    }
}