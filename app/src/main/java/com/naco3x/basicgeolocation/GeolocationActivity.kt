package com.naco3x.basicgeolocation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_geolocation.*

class GeolocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geolocation)

        geoGetButton.setOnClickListener {
                        try {
                            geoTextView.text = "You intended to get your location! Congrats!!"
                //startLocationUpdates()
            }
            catch (e : SecurityException) {
            }
        }
    }
}
