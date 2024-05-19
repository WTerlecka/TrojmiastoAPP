package com.example.trojmiastoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AttractionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attractions)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val city = intent.getStringExtra("city")
        val attractions = getAttractionsForCity(city)

        val adapter = AttractionAdapter(attractions)
        recyclerView.adapter = adapter
    }

    private fun getAttractionsForCity(city: String?): List<Attraction> {
        return when (city) {
            "Gdańsk" -> listOf(
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdansk_attraction_1), "Opis atrakcji 1"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdansk_attraction_2), "Opis atrakcji 2"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdansk_attraction_3), "Opis atrakcji 3"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdansk_attraction_4), "Opis atrakcji 4"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdansk_attraction_5), "Opis atrakcji 5")
            )
            "Gdynia" -> listOf(
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdynia_attraction_1), "Opis atrakcji 1"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdynia_attraction_2), "Opis atrakcji 2"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdynia_attraction_3), "Opis atrakcji 3"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdynia_attraction_4), "Opis atrakcji 4"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.gdynia_attraction_5), "Opis atrakcji 5")
            )
            "Sopot" -> listOf(
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.sopot_attraction_1), "Opis atrakcji 1"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.sopot_attraction_2), "Opis atrakcji 2"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.sopot_attraction_3), "Opis atrakcji 3"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.sopot_attraction_4), "Opis atrakcji 4"),
                Attraction(R.drawable.ic_launcher_foreground, getString(R.string.sopot_attraction_5), "Opis atrakcji 5")
            )
            else -> emptyList()
        }
    }
}