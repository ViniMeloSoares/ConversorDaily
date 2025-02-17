package com.example.conversordaily

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_iniciar = findViewById<Button>(R.id.btn_iniciar)
        val intent1 = Intent(this, Result_Activity::class.java)

        btn_iniciar.setOnClickListener {

            startActivity(intent1)

        }
      }
}

