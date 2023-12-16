package com.example.playlistmaker

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
        val library_button = findViewById<Button>(R.id.library_button)
        val setting_button = findViewById<Button>(R.id.setting_button)

        val ButtonClickListener1: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку!", Toast.LENGTH_SHORT).show()
            }
        }
        val ButtonClickListener2: View.OnClickListener = View.OnClickListener { Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show() }

        search_button.setOnClickListener(ButtonClickListener1)
        library_button.setOnClickListener(ButtonClickListener2)
        setting_button.setOnClickListener(ButtonClickListener2)

    }
}