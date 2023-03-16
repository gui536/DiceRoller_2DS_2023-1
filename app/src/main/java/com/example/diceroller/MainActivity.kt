package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.btnRollDice)

        //Define uma função para ser executada quando clicarmos no botão
        rollButton.setOnClickListener(){
            //gera uma Toast na tela informado que rolamos um dado.
            val toast = Toast.makeText(this, "Rolou um dado!", Toast.LENGTH_SHORT)
            rollDice()
        }
    }
    fun rollDice(){
        val dice = Dice(6)
        val resultText: TextView = findViewById(R.id.txtRollResult)
        val imageView: ImageView = findViewById(R.id.imageView)
        val diceRoll = dice.roll()



        if (diceRoll == 1){
            imageView.setImageResource(R.drawable.dice_1)
        }
        if (diceRoll == 2){
            imageView.setImageResource(R.drawable.dice_1)
        }
        if (diceRoll == 3){
            imageView.setImageResource(R.drawable.dice_1)
        }
        resultText.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int){
        fun roll(): Int{
            return (1..numSides).random()
        }
    }


}