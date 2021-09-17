package com.bm.birthdaygreetingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        val input = findViewById<EditText>(R.id.Input_name)
        val btn = findViewById<Button>(R.id.Create_btn)


        btn.setOnClickListener {

            val name = input.text.toString()

            Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, CardPage::class.java)
            intent.putExtra(CardPage.Name_Extra,name)
            startActivity(intent)


        }

    }
}