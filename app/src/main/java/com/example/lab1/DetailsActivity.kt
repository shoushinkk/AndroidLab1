package com.example.lab1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        title = findViewById(R.id.title)
        desc = findViewById(R.id.desc)

        val bundle: Bundle? = intent.extras
        title.text = bundle?.getString("title")
        desc.text = bundle?.getString("desc")
    }
}