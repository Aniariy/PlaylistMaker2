package com.example.playlistmaker


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val search_button = findViewById<Button>(R.id.search_button)
        val lybrary_button = findViewById<Button>(R.id.lybrary_button)
        val setting_button = findViewById<Button>(R.id.setting_button)

        search_button.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }
        lybrary_button.setOnClickListener {
            val searchIntent = Intent(this, LybraryActivity::class.java)
            startActivity(searchIntent)
        }
        setting_button.setOnClickListener {
            val settingIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingIntent)
        }


    }
}