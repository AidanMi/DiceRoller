package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        val diceOne:ImageView = findViewById(R.id.diceOne)
        rollButton.text = "Roll Dice"

        rollButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }


    }
    private fun rollDice(){
        val random = Random.nextInt(6)+1
        val diceOne:ImageView = findViewById(R.id.diceOne)
        val drawableResource = when (random){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        diceOne.setImageResource(drawableResource)
    }
}
