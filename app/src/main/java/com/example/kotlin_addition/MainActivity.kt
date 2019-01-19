package com.example.kotlin_addition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            result.text = (edit1.text.toString().toInt()+edit2.text.toString().toInt()).toString()
        }

        button1.setOnClickListener {
            result.text = (edit1.text.toString().toInt()-edit2.text.toString().toInt()).toString()
        }

        button2.setOnClickListener {
            result.text = (edit1.text.toString().toInt()*edit2.text.toString().toInt()).toString()
        }

        button3.setOnClickListener {
            result.text = (edit1.text.toString().toInt()/edit2.text.toString().toInt()).toString()
        }

    }
}
