package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
            val resultText: TextView = findViewById(R.id.txtRollResult)
            resultText.text = "1"
        }
    }

}