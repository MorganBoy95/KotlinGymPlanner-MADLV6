package com.sid1629603.every_move.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.sid1629603.every_move.AppNavigator
import com.sid1629603.every_move.R
import kotlinx.android.synthetic.main.fragment_index.*


class IndexFragment : Fragment() {

    private lateinit var appNavigator: AppNavigator

    override fun onAttach(context: Context) {
        super.onAttach(context)
        appNavigator = context as AppNavigator
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_index, container, false)

        val loginButton: Button = view.findViewById(R.id.indexLogin)
        val registerButton: Button = view.findViewById(R.id.indexRegister)

        loginButton.setOnClickListener{
            appNavigator.navigateToLogin()
        }
        registerButton.setOnClickListener{
            appNavigator.navigateToGetStarted()
        }

        return view;

    }


}