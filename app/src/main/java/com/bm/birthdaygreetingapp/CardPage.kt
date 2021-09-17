package com.bm.birthdaygreetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CardPage : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_page)
        supportActionBar?.hide()

        val name = intent.getStringExtra(Name_Extra)
        val op = findViewById<TextView>(R.id.Birthday_Greet)
        val op2 = findViewById<TextView>(R.id.Birthday_Greet_2)
        op.text= "Happy Birthday $name"
        op2.text= "Happy Birthday $name"
    }
}