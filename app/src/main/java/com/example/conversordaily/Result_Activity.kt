package com.example.conversordaily

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordaily.databinding.ActivityResultBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var binding: ActivityResultBinding

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Recuperando para o Spinner de peso
        val spinnerpesoentrada: Spinner = binding.spPesoEntrada
        val spinnerpesosaida: Spinner = binding.spPesoSaida

        // Recuperando Spinner de comprimento
        val spinnercomprimentoentrada: Spinner = binding.spComprimentoEntrada
        val spinnercomprimentosaida: Spinner = binding.spComprimentoSaida

        // Recuperando Spinner de volume
        val spinnervolumeentrada: Spinner = binding.spVolumeEntrada
        val spinnervolumesaida: Spinner = binding.spVolumeSaida

        // Recuperando botões e result
        val btnconverter: Button = binding.buttonConverter
        val bntnovocalculo: Button = binding.buttonNovoCalculo
        val tvResult: TextView = binding.TvResult

        // Lista de opções Spinner
        val optionsPeso = arrayOf(
            "Quilograma",
            "Tonelada",
            "Hectograma",
            "Decagrama",
            "Grama",
            "Decigrama",
            "Centigrama",
            "Centigrama",
            "Miligrama"
        )

        val optionsComprimento = arrayOf(
            "Quilômetro",
            "Hectômetro",
            "Decâmetro",
            "Metro",
            "Decímetro",
            "Centíemetro",
            "Milímetro"
        )

        val optionsVolume = arrayOf(
            "Quilolitro",
            "Hectrolitro",
            "Decalitro",
            "Decilitro",
            "Centilitro",
            "Mililitro",
            "Litro"
        )

        //  Criação do ArrayAdapter para o Spinner
        val adapterPeso = ArrayAdapter(this, android.R.layout.simple_spinner_item, optionsPeso)
        val adapterComprimento =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, optionsComprimento)
        val adapterVolume = ArrayAdapter(this, android.R.layout.simple_spinner_item, optionsVolume)

        // Definição de layout para as opções do Spinner

        adapterPeso.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        adapterComprimento.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        adapterVolume.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)

        //Aplicação do adaptador ao Spinner
        spinnerpesoentrada.adapter = adapterPeso
        spinnerpesosaida.adapter = adapterPeso
        spinnercomprimentoentrada.adapter = adapterComprimento
        spinnercomprimentosaida.adapter = adapterComprimento
        spinnervolumeentrada.adapter = adapterVolume
        spinnervolumesaida.adapter = adapterVolume

        //Conversão das medidas
        val conversaopeso = mapOf(
            "Quilograma" to 1.0,
            "Tonelada" to 1000.0,
            "Hectagrama" to 0.1,
            "Dectagrama" to 0.01,
            "Grama" to 0.001,
            "Decigrama" to 0.0001,
            "Centigrama" to 0.00001,
            "Miligrama" to 0.000001
        )

        val conversaocomprimento = mapOf(
            "Quilômetro" to 1000.0,
            "Hectrômetro" to 100.0,
            "Decâmetro" to 10.0,
            "Metro" to 1.0,
            "Decímetro" to 0.1,
            "Centímetro" to 0.01,
            "Milímetro" to 0.001
        )

        val conversaolitro = mapOf(
            "Quilolitro" to 0.001,
            "Hectolitro" to 0.01,
            "Decalitro" to 0.1,
            "Litro" to 1.0,
            "Decilitro" to 10.0,
            "Centilitro" to 100.0,
            "Mililitro" to 1000.0
        )

        //Clique botão conversor
        btnconverter.setOnClickListener {
            val PesoValue = binding.edtPeso.text.toString()
            val ComprimentoValue = binding.edtComprimento.text.toString()
            val VolumeValue = binding.edtVolume.text.toString()

            //Verificar se os valores estão vazios
            if (PesoValue.isNotEmpty() && (ComprimentoValue.isNotEmpty()) && (VolumeValue.isNotEmpty())) {
            Toast.makeText(
                 this,
                 "Prencha o valor a ser convertido",
            Toast.LENGTH_LONG)
            .show()
            return@setOnClickListener
      }

        var resultado = 0.0
        var unidadeSaida = ""
    }
  }
}