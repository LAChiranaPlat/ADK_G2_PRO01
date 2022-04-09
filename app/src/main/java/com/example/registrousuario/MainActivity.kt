package com.example.registrousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.registrousuario.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layout:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityMainBinding.inflate(layoutInflater)

        setContentView(layout.root)

        val registrar=layout.btnReg
        val listar=layout.btnList
        val salir=layout.btnExit

        registrar.setOnClickListener {
            startActivity(Intent(this,NewUser::class.java))
        }

        listar.setOnClickListener {
            startActivity(Intent(this,ListUsers::class.java))
        }

        salir.setOnClickListener {
            finish()
        }

    }
}