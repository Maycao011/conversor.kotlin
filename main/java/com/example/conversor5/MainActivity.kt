package com.example.conversor5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var valor: EditText
    private lateinit var button: Button
    private lateinit var result: TextView
    private lateinit var dollar: RadioButton
    private lateinit var euro: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor = findViewById(R.id.Ediçao)
        button = findViewById(R.id.button_conversor)
        result = findViewById(R.id.Resultado)
        dollar = findViewById(R.id.Moeda_dollar)
        euro = findViewById(R.id.Moeda_euro)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (valor.text.isEmpty()) {
            result.text = "Digite um valor"
            result.visibility = View.VISIBLE
            return
        }
        if (dollar.isChecked()) {
            val conversorDollar = 0.2013f
            val total = String.format("%.2f", valor.text.toString().toFloat() * conversorDollar)
            result.text = "US$ $total"
            result.visibility = View.VISIBLE
        }
        if (euro.isChecked()) {
            val conversorEuro = 0.1868f
            val total = String.format("%.2f", valor.text.toString().toFloat() * conversorEuro)
            result.text = "€ $total"
            result.visibility = View.VISIBLE
        }
    }
}