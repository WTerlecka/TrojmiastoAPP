package com.example.trojmiastoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gdansk = findViewById<TextView>(R.id.gdansk)
        val gdynia = findViewById<TextView>(R.id.gdynia)
        val sopot = findViewById<TextView>(R.id.sopot)

        gdansk.setOnClickListener {
            startAttractionsActivity("Gdańsk")
        }

        gdynia.setOnClickListener {
            startAttractionsActivity("Gdynia")
        }

        sopot.setOnClickListener {
            startAttractionsActivity("Sopot")
        }
    }
    private fun startAttractionsActivity(city: String) {
        val intent = Intent(this, AttractionsActivity::class.java)
        intent.putExtra("city", city)
        startActivity(intent)
    }
}