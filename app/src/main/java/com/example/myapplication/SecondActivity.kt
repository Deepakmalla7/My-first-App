package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Retrieve data from Intent
        val fullName = intent.getStringExtra("FULL_NAME")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")
        val country = intent.getStringExtra("COUNTRY")
        val city = intent.getStringExtra("CITY")

        // Set data to TextViews
        findViewById<TextView>(R.id.textViewWelcome).text = "Welcome, $fullName"
        findViewById<TextView>(R.id.textViewEmail).text = "Email: $email"
        findViewById<TextView>(R.id.textViewGender).text = "Gender: $gender"
        findViewById<TextView>(R.id.textViewCountry).text = "Country: $country"
        findViewById<TextView>(R.id.textViewCity).text = "City: $city"
    }
}