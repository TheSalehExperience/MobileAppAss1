package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array12 = arrayOf("saleh", "salooh", "salehon", "salehSama")
        val spinner:Spinner = findViewById(R.id.spinner)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener { Toast.makeText(this, "You've agreed to give 20/20 to -> " + array12[spinner.selectedItemPosition],Toast.LENGTH_SHORT).show() }
        spinner.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, array12 )
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {


            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, array12[position],Toast.LENGTH_SHORT).show()

            }
        }
    }
}