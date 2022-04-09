package com.example.registrousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.example.registrousuario.databinding.ActivityNewUserBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class NewUser : AppCompatActivity() {

    lateinit var views:ActivityNewUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityNewUserBinding.inflate(layoutInflater)

        setContentView(views.root)

        views.tilNick.editText?.requestFocus()

        val nick=views.tilNick.editText
        val name=views.tilName.editText
        val lname=views.tilLname.editText
        val id=views.tilID.editText

        views.btnRegNewUser.setOnClickListener {

            if( camposValidos(nick!!, name!!, lname!!, id!!) )
            {

                val i=Intent(this,userCreate::class.java).apply {
                    putExtra("nick",nick.text.toString())
                    putExtra("name",name.text.toString())
                    putExtra("lname",lname.text.toString())
                    putExtra("id",id.text.toString())
                }

                startActivity(i)

                return@setOnClickListener

            }

            MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.tituloRegistroUsuarioError))
                .setMessage(resources.getString(R.string.mensajeRegistroUsuarioError))
                .setPositiveButton("OK") { dialog, which ->

                }
                .show()
        }

        views.btnCancelRegister.setOnClickListener{

           /* nick?.text?.clear()
            name?.text?.clear()
            lname?.text?.clear()
            id?.text?.clear()*/
            finish()

        }

    }

    fun camposValidos(vararg campos:EditText):Boolean{

        var validacion=false

        for(c in campos){

            if(c.text.toString().isEmpty()){
                validacion=false
                c.requestFocus()
                return false
            }

        }

        return true

    }
}