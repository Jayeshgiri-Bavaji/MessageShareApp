package com.jbavaji.messageshareapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //  code will goes here
            Log.i("MainActivity", "Button is clicked!!!")
            Toast.makeText(this, resources.getString(R.string.button_click), Toast.LENGTH_SHORT).show()
        }

        btnShowToastAgain.setOnClickListener {
            Toast.makeText(this, resources.getString(R.string.button_click_again), Toast.LENGTH_SHORT).show()
        }
    }
}
