package com.jbavaji.messageshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jbavaji.messageshareapp.R
import com.jbavaji.messageshareapp.extensions.Constants
import com.jbavaji.messageshareapp.extensions.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //  Safe call ?.
        //  Safe call ?.let{}
        //  null porter assertion !!

        val bundle: Bundle? = intent.extras

        //  if bundle is not null than block of code will be execute
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)
            showToast(msg)

            txtUserMessage.text = msg
        }
    }
}
