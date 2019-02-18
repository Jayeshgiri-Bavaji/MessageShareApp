package com.jbavaji.messageshareapp.extensions

import android.app.Activity
import android.content.Context
import android.widget.Toast


/**
 * Created by Jayeshgiri Bavaji on 2/18/2019.
 * Synechron Technologies
 * jayeshgiri.bavaji@synechron.com
 */

fun Context.showToast(message:String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}