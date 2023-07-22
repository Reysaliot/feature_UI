package com.example.dashboardactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dashboardactivity.R.id.btn_buy
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Burger1 = findViewById<Button>(R.id.btn_buy)
        Burger1.setOnClickListener{
            val Intent = Intent(this, burger_1::class.java)
            startActivity(Intent)

        val Burger2 = findViewById<MaterialButton>(R.id.btn_2)
            Burger2.setOnClickListener {
                val Intent = Intent(this, burger_2::class.java)
                startActivity(Intent)

        val Burger3 = findViewById<MaterialButton>(R.id.btn_3)
            Burger3.setOnClickListener {
                val Intent = Intent(this, burger_3::class.java)
                startActivity(Intent)

               }

            }

        }
    }
}