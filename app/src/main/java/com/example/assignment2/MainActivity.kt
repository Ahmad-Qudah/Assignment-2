package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gen :Button=findViewById(R.id.generate)
        val RandomValue =Random.nextInt(0, 20)
        val num1: TextView =findViewById(R.id.textV1)
        val num2 :TextView =findViewById(R.id.YourNum)


        gen.setOnClickListener {
            num1.text=RandomValue.toString()
            val  loNum =Random.nextInt(0,9)
            val hiNum =Random.nextInt(10,20)

        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val ahm=menuInflater
        ahm.inflate(R.menu.options_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    val num2 :TextView =findViewById(R.id.YourNum)
    val  loNum =Random.nextInt(0,9)
    val hiNum =Random.nextInt(10,20)


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.option1-> num2.text=loNum.toString()

            R.id.option2->num2.text=hiNum.toString()


        }

        return true;
    }

}