package com.example.lab1

import android.graphics.drawable.Drawable

data class Animal(
    val id: Long,
    val imageRes: Drawable,
    val description: String,
    val title: String,
    val fullDescription: String
)