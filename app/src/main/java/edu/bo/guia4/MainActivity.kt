package edu.bo.guia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val btnServicios:Button
        get()=findViewById(R.id.btn_servicios)
    private val btnPortafolio:Button
        get()=findViewById(R.id.btn_portafolio)
    private val btnAbout:Button
        get()=findViewById(R.id.btn_about)
    private val btnContact:Button
        get()=findViewById(R.id.btn_contacto)
    private val btnRedesSociales:Button
        get()=findViewById(R.id.btn_rrss)
    private val clickText:TextView
        get()=findViewById(R.id.textClickButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnServicios.setOnClickListener {
            clickText.setText(btnServicios.text.toString())
        }
        btnPortafolio.setOnClickListener {
            clickText.setText(btnPortafolio.text.toString())
        }
        btnAbout.setOnClickListener {
            clickText.setText(btnAbout.text.toString())
        }
        btnContact.setOnClickListener {
            clickText.setText(btnContact.text.toString())
        }
        btnRedesSociales.setOnClickListener {
            clickText.setText(btnRedesSociales.text.toString())
        }
    }
}