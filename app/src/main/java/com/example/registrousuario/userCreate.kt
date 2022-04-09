package com.example.registrousuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.registrousuario.databinding.ActivityUserCreateBinding

class userCreate : AppCompatActivity() {

    lateinit var views:ActivityUserCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityUserCreateBinding.inflate(layoutInflater)

        setContentView(views.root)

        views.txtNick.text=intent.getStringExtra("nick")
        views.txtName.text=intent.getStringExtra("name")
        views.txtLname.text=intent.getStringExtra("lname")
        views.txtDNI.text=intent.getStringExtra("id")



    }
}