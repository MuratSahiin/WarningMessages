package com.murats.deneme07

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


buttonid.setOnClickListener {

     //   Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

    val warning = AlertDialog.Builder(this)
    warning.setTitle("Warning!!!")
    warning.setMessage("Areu sure about ur password")
    warning.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
        Toast.makeText(this,"Try Again",Toast.LENGTH_LONG).show()
    })
    warning.setNegativeButton("No",DialogInterface.OnClickListener {dialogInterface, i ->
        Toast.makeText(this,"Your Lost",Toast.LENGTH_SHORT).show()
    })
    warning.show()
}
//-----------  it s doing samething but it uses method name for button only ---------
        /*fun sendMessage(view :View){
            val warning = AlertDialog.Builder(applicationContext)
            warning.setTitle("Warning!!!")
            warning.setMessage("Areu sure about ur password")
            warning.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Try Again",Toast.LENGTH_LONG).show()
            })
            warning.setNegativeButton("No",DialogInterface.OnClickListener {dialogInterface, i ->
                Toast.makeText(this,"Your Lost",Toast.LENGTH_SHORT).show()
            })
                warning.show()
        }*/



    }
}