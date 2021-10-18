package com.testlslavag76.pacerunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testlslavag76.pacerunner.databinding.ActivityPaceBinding

class PaceActivity : AppCompatActivity() {

    lateinit var bindingPace: ActivityPaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingPace = ActivityPaceBinding.inflate(layoutInflater)
        setContentView(bindingPace.root)

        bindingPace.buttonCalculatePace.setOnClickListener {

            val finishHourFromView = bindingPace.editTextFinishHour.text.toString().toInt()
            val finishMinuteFromView = bindingPace.editTextFinishMin.text.toString().toInt()
            val finishSecondFromView = bindingPace.editTextFinishSec.text.toString().toInt()

            val finishDistanceFromView =
                bindingPace.editTextFinishDistance.text.toString().toDouble()

            val totalSecond =
                finishHourFromView * 3600 + finishMinuteFromView * 60 + finishSecondFromView

            var totalPaceSecond = (totalSecond.toDouble() / finishDistanceFromView) * 1000

            var paceMinute = (totalPaceSecond / 60).toInt()
            var paceSecond = totalPaceSecond - paceMinute * 60

            bindingPace.resultViewPace.text = "${paceMinute} мин ${paceSecond.toInt()} сек"

        }

    }
}