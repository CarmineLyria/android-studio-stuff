package com.example.fragments

import android.R
import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        //---get the current display info---
        val display = this.resources.displayMetrics
        val width = display.widthPixels
        val height = display.heightPixels
        if (width > height) {
//---landscape mode---
            val fragment1 = Fragment1()
            // android.R.id.content refers to the content
// view of the activity
            fragmentTransaction.replace(
                R.id.content, fragment1
            )
        } else {
//---portrait mode---
            val fragment2 = Fragment2()
            fragmentTransaction.replace(
                R.id.content, fragment2
            )
        }
        fragmentTransaction.commit()
    }
}