package com.naco3x.basicgeolocation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnstart.setOnClickListener {
            val intent = Intent(this, GeolocationActivity::class.java)
            startActivity(intent)
        }
    }
}
