package com.testlslavag76.pacerunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testlslavag76.pacerunner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.buttonTime.setOnClickListener {

            val intentTimeActivity = Intent(this, TimeActivity::class.java)
            startActivity(intentTimeActivity)

        }

        bindingMain.buttonPace.setOnClickListener {

            val intentPaceActivity = Intent(this, PaceActivity::class.java)
            startActivity(intentPaceActivity)

        }

        bindingMain.buttonDistance.setOnClickListener {

            val intentDistanceActivity = Intent(this, DistanceActivity::class.java)
            startActivity(intentDistanceActivity)

        }

    }
}