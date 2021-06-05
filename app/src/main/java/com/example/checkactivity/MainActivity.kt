package com.example.checkactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        var i:Int = 0

        button.setOnClickListener {
            i++
            textView.text = (i.toString())

        }
    }


}