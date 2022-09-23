package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext1 = findViewById<EditText>(R.id.et1)
        val edittext2 = findViewById<EditText>(R.id.et2)
        val edittext3 = findViewById<EditText>(R.id.et3)
        val textview = findViewById<TextView>(R.id.tv)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            val sign = edittext3.editableText.toString()
            val firstNumber = edittext1.editableText.toString().toDouble()
            val secondNumber = edittext2.editableText.toString().toDouble()


            if (sign == "+")
            {
                val res = firstNumber + secondNumber
                textview.text = res.toString()
            }

            if (sign == "-")
            {
                val res = firstNumber - secondNumber
                textview.text = res.toString()
            }

            if (sign == "/")
            {
                val res = firstNumber / secondNumber
                textview.text = res.toString()
            }
            if (sign == "*")
            {
                val res = firstNumber * secondNumber
                textview.text = res.toString()
            }
            if (sign == "%")
            {
                val res = firstNumber % secondNumber
                textview.text = res.toString()
            }
        }
    }
}