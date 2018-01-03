package com.buzzfeed.kotlininstantapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.buzzfeed.greetingfeature.R
import com.buzzfeed.modellibrary.model.ActionModel
import kotlinx.android.synthetic.main.activity_greeting.*

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, ActionModel().actionText, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
