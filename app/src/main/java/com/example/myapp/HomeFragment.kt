package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val buttonGoogle = view.findViewById<TextView>(R.id.tv_signGoogle)
        buttonGoogle.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_loginSreen)
        }

        val buttonFace = view.findViewById<TextView>(R.id.tv_signFace)
        buttonFace.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_loginSreen)
        }

        val buttonEmail = view.findViewById<TextView>(R.id.tv_signEmail)
        buttonEmail.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_loginSreen)
        }

        return view
    }
}