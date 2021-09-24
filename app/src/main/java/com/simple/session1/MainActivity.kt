package com.simple.session1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This line will connect XML Laytout file with java or kotlin activity code
        setContentView(R.layout.activity_main)

        //this line use to connect commponent to java code
        val etInput1 = findViewById<EditText>(R.id.etInput1)
        val etInput2 = findViewById<EditText>(R.id.etInput2)
        val bnAdd = findViewById<Button>(R.id.bnAdd)
        val bnMin = findViewById<Button>(R.id.bnMin)
        val bnMulti = findViewById<Button>(R.id.bnMulti)
        val tvOutput = findViewById<TextView>(R.id.tvOutput)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        //use this if you have 1 or 2 button in your screen
        bnAdd.setOnClickListener {
            //Retrived data from edittext into string variable
            val stringInput1 = etInput1.text.toString()
            val stringInput2 = etInput2.text.toString()

            //addition logic and get result into one variable
            val answerString  = stringInput1.toInt()+stringInput2.toInt()

            //show the result on Textview as output
            tvOutput.setText(answerString.toString())

            //Print Output on the screen
            Toast.makeText(this@MainActivity,answerString.toString(),Toast.LENGTH_SHORT).show()
        }
        //need to use if you have multiple button
//        bnAdd.setOnClickListener(this)
    }

    /*
    * Task:1
    * Use Min & Multi Button and print output on textview
    * Task:2
    * Add Two more button in xml and use that here and perform operation
    *
     */




}