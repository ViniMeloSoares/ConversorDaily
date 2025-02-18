package com.example.conversordaily

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordaily.databinding.ActivityResultBinding

private lateinit var binding: ActivityResultBinding

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter_peso = ArrayAdapter.createFromResource(
            this,
            R.array.Peso,
            android.R.layout.simple_spinner_item
        )
        adapter_peso.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spPesoEntrada.adapter = adapter_peso
        binding.spPesoSaida.adapter = adapter_peso

        val adapter_distancia = ArrayAdapter.createFromResource(
            this,
            R.array.distancia,
            android.R.layout.simple_spinner_item
        )
        adapter_distancia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spDistanciaEntrada.adapter = adapter_distancia
        binding.spDistanciaSaida.adapter = adapter_distancia

        val adapter_volume = ArrayAdapter.createFromResource(
            this,
            R.array.Volume,
            android.R.layout.simple_spinner_item
        )
        adapter_volume.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spVolumeEntrada.adapter = adapter_volume
        binding.spVolumeSaida.adapter = adapter_volume

    }
}