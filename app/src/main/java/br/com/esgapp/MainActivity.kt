package br.com.esgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar: Button = findViewById(R.id.submit_btn);

        btnEntrar.setOnClickListener {
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }
    }
}