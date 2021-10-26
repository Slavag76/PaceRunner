package com.testlslavag76.pacerunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testlslavag76.pacerunner.databinding.ActivityDistanceBinding

class DistanceActivity : AppCompatActivity() {

    lateinit var bindingDistance: ActivityDistanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDistance = ActivityDistanceBinding.inflate(layoutInflater)
        setContentView(bindingDistance.root)

        bindingDistance.buttonCalculateDistance.setOnClickListener {

            val editTextHoursFT = bindingDistance.editTextHoursFT.text.toString().toInt()
            val editTextMinFT = bindingDistance.editTextMinFT.text.toString().toInt()
            val editTextSecFT = bindingDistance.editTextSecFT.text.toString().toInt()

            val minPaceFromView = bindingDistance.minPaceFromView.text.toString().toInt()
            val secPaceFromView = bindingDistance.secPaceFromView.text.toString().toInt()

            val totalSecond = editTextHoursFT * 3600 + editTextMinFT * 60 + editTextSecFT
            val paceSecond = minPaceFromView * 60 + secPaceFromView

            val resultKM = totalSecond / paceSecond
            val resultMet = totalSecond % paceSecond

            bindingDistance.resultDistance.text = "${resultKM} км ${resultMet} м"

        }
    }
}