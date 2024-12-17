package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring Views
        val fullNameEditText = findViewById<EditText>(R.id.full_name)
        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val genderRadioGroup = findViewById<RadioGroup>(R.id.genderRadioGroup)
        val countrySpinner = findViewById<Spinner>(R.id.countrySpinner)
        val cityAutoComplete = findViewById<AutoCompleteTextView>(R.id.cityAutoComplete)
        val termsCheckBox = findViewById<CheckBox>(R.id.termsCheckBox)
        val submitButton = findViewById<Button>(R.id.submitButton)

        // Dropdown for Country
        val countries = arrayOf("Nepal", "India", "USA", "China", "Japan")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countries)
        countrySpinner.adapter = spinnerAdapter

        // Autocomplete for Cities
        val cities = arrayOf("Kathmandu", "Pokhara", "Rukum", "Delhi", "New York", "Tokyo")
        val autoCompleteAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, cities)
        cityAutoComplete.setAdapter(autoCompleteAdapter)
