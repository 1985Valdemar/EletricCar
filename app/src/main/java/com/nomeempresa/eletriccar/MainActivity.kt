package com.nomeempresa.eletriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var preço:EditText
    lateinit var btnCalcular: Button
    lateinit var kmPercorrido:EditText
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView(){
        preço = findViewById(R.id.et_preço_kWh)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_Resultado)
        btnCalcular = findViewById(R.id.btn_calcular)

    }

    fun setupListeners(){
        btnCalcular.setOnClickListener {
            calcular()
        }
    }
    fun calcular (){
        val preço = preço.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()

        val result = preço / km

        resultado.text = result.toString()

    }
}