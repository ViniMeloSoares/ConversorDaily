package com.example.conversordaily

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
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
        val adapterPeso = ArrayAdapter(this,android.R.layout.simple_spinner_item, optionsPeso)
        val adapterComprimento = ArrayAdapter(this, android.R.layout.simple_spinner_item, optionsComprimento)
        val adapterVolume = ArrayAdapter(this,android.R.layout.simple_spinner_item, optionsVolume)

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




    }
}