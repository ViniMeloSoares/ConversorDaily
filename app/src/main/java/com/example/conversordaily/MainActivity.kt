package com.example.conversordaily


import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordaily.databinding.ActivityMainBinding
import com.example.conversordaily.databinding.ActivityResultBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = Intent(this, Result_Activity::class.java)

        binding.btnIniciar.setOnClickListener {
            startActivity(intent)

        }
      }
    }

