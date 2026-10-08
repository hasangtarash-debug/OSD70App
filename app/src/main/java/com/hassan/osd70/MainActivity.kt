package com.hassan.osd70

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProgram = findViewById<Button>(R.id.btnProgram)
        val btnSupport = findViewById<Button>(R.id.btnSupport)

        btnProgram.setOnClickListener {
            startActivity(Intent(this, DayListActivity::class.java))
        }

        btnSupport.setOnClickListener {
            startActivity(Intent(this, SupportActivity::class.java))
        }
    }
}
