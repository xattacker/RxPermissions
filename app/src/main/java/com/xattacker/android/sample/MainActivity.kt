package com.xattacker.android.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.xattacker.android.permission.RxPermissions

class MainActivity : AppCompatActivity()
{
    private var rxp: RxPermissions? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View)
    {
    }
}
