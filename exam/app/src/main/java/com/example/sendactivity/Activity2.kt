package com.example.sendactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        //lay du lieu tu intent
        var intent = intent
        var name = intent.getStringExtra("Name")
        var phonenumber = intent.getStringExtra("Phonenumber")


        val send_name = findViewById<TextView>(R.id.send_name)
        val send_phonenumber = findViewById<TextView>(R.id.send_phonenumber)


        send_name.text= name
        send_phonenumber.text= phonenumber
    }
}