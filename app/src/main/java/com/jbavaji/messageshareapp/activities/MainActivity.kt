package com.jbavaji.messageshareapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.jbavaji.messageshareapp.R
import com.jbavaji.messageshareapp.extensions.Constants
import com.jbavaji.messageshareapp.extensions.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //  code will goes here
            Log.i(TAG, "Button is clicked!!!")
            showToast( resources.getString(R.string.button_click), Toast.LENGTH_LONG)
        }

        btnSendToActivity.setOnClickListener {
            val message : String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }

        btnShareToOtherActivity.setOnClickListener {
            val message : String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please Select Share App - "))
        }

        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
