package com.sid1629603.every_move

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.navigation.findNavController
import com.sid1629603.every_move.fragments.GetStartedFragment
import com.sid1629603.every_move.fragments.IndexFragmentDirections
import com.sid1629603.every_move.fragments.IndexFragment


class MainActivity : AppCompatActivity(), AppNavigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun navigateToGetStarted() {

        val action = IndexFragmentDirections.actionIndexFragmentToGetStartedFragment()
        findNavController(R.id.nav_host_fragment_signin).navigate(action)
    }

    override fun navigateToLogin() {

        val action = IndexFragmentDirections.actionIndexFragmentToLoginFragment()
        findNavController(R.id.nav_host_fragment_signin).navigate(action)
    }
}