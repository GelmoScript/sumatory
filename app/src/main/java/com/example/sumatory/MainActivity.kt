package com.example.sumatory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sumNumbersAction(view: View) {
        if (view is Button) {
            resultTV.text = "Resultado: " + (num1.text.toString().toFloat() + num2.text.toString().toFloat()).toString()
        }
    }

}