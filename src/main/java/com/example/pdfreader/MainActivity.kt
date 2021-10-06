package com.example.pdfreader

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showBtn = findViewById<Button>(R.id.btn)
        showBtn.setOnClickListener{
            val intent = Intent(this@MainActivity, ViewPdfActivity::class.java)
            startActivity(intent)
        }
    }
}