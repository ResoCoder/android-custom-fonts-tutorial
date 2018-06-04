package com.resocoder.fontstutorial

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnCheckedChangeListener { compoundButton, checked ->
            if (checked)
                textView3.typeface = ResourcesCompat.getFont(this, R.font.rokkitt_medium)
            else
                textView3.typeface = Typeface.DEFAULT
        }
    }
}
