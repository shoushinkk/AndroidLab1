package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var birdImage: ImageView
    private lateinit var turtleImage: ImageView
    private lateinit var dogImage: ImageView

    private lateinit var birdTitle: TextView
    private lateinit var dogTitle: TextView
    private lateinit var turtleTitle: TextView

    private lateinit var birdDesc: TextView
    private lateinit var dogDesc: TextView
    private lateinit var turtleDesc: TextView

    private lateinit var birdButton: Button
    private lateinit var dogButton: Button
    private lateinit var turtleButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogData = getDrawable(R.drawable.dog)?.let {
            Animal(
                id = 0,
                imageRes = it,
                description = "she is not bite",
                title = "Dog",
                fullDescription = "A dog is a domestic mammal of the family Canidae and the order Carnivora. Its scientific name is Canis lupus familiaris. Dogs are a subspecies of the gray wolf, and they are also related to foxes and jackals. Dogs are one of the two most ubiquitous and most popular domestic animals in the world."
            )
        }
        val turtleData = getDrawable(R.drawable.turtle)?.let {
            Animal(
                id = 1,
                imageRes = it,
                description = "i can swim and walk",
                title = "Turtle",
                fullDescription = "Turtles are reptiles of the order Testudines, characterized by a special shell developed mainly from their ribs. Modern turtles are divided into two major groups, the Pleurodira (side necked turtles) and Cryptodira (hidden necked turtles), which differ in the way the head retracts."
            )
        }
        val birdData = getDrawable(R.drawable.bird)?.let {
            Animal(
                id = 0,
                imageRes = it,
                description = "just a small bird",
                title = "Bird",
                fullDescription = "Birds are vertebrate animals that have feathers, wings, and beaks. Like all vertebrates, they have bony skeleton. Most birds are able to fly, but some (like ostriches and penguins) cannot fly even though they still have wings."
            )
        }

        birdImage = findViewById(R.id.imageBird)
        turtleImage = findViewById(R.id.imageTurtle)
        dogImage = findViewById(R.id.imageDog)

        birdImage.setImageDrawable(birdData?.imageRes)
        dogImage.setImageDrawable(dogData?.imageRes)
        turtleImage.setImageDrawable(turtleData?.imageRes)

        birdTitle = findViewById(R.id.titleBird)
        dogTitle = findViewById(R.id.dogTitle)
        turtleTitle = findViewById(R.id.turtleTitle)

        birdTitle.text = birdData?.title
        dogTitle.text = dogData?.title
        turtleTitle.text = turtleData?.title

        birdDesc = findViewById(R.id.descBird)
        dogDesc = findViewById(R.id.dogDesc)
        turtleDesc = findViewById(R.id.descTurtle)

        birdDesc.text = birdData?.description
        dogDesc.text = dogData?.description
        turtleDesc.text = turtleData?.description

        birdButton = findViewById(R.id.buttonBird)
        dogButton = findViewById(R.id.buttonDog)
        turtleButton = findViewById(R.id.turtleButton)

        val intent = Intent(this, DetailsActivity::class.java)
        birdButton.setOnClickListener {
            intent.putExtra("title", birdData?.title)
            intent.putExtra("desc", birdData?.fullDescription)
            startActivity(intent)
        }
        dogButton.setOnClickListener {
            intent.putExtra("title", dogData?.title)
            intent.putExtra("desc", dogData?.fullDescription)
            startActivity(intent)
        }
        turtleButton.setOnClickListener {
            intent.putExtra("title", turtleData?.title)
            intent.putExtra("desc", turtleData?.fullDescription)
            startActivity(intent)
        }
    }
}