package com.buzzfeed.kotlininstantapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzzfeed.greetingfeature.R

/**
 * A placeholder fragment containing a simple view.
 */
class GreetingActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_greeting, container, false)
    }
}
