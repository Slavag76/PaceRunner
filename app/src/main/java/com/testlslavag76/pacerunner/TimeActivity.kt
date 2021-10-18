package com.testlslavag76.pacerunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.testlslavag76.pacerunner.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity() {

    lateinit var bindingTime: ActivityTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingTime = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(bindingTime.root)

        bindingTime.buttonCalculateTime.setOnClickListener {

            val paceMinuteFromView = bindingTime.editPaceMinute.text.toString()
            val paceSecondsFromView = bindingTime.editPaceSeconds.text.toString()
            val distanceFromView = bindingTime.editDistance.text.toString()


            var timeTemp =
                distanceFromView.toInt() * (paceMinuteFromView.toInt() * 60 + paceSecondsFromView.toInt()) / 1000


            var timeHour = timeTemp / 3600
            var timeMinute = (timeTemp - timeHour * 3600) / 60
            var timeSeconds = timeTemp % 60

            bindingTime.resultViewTime.text = "${timeHour} ч ${timeMinute} мин ${timeSeconds} сек"


        }

    }


}