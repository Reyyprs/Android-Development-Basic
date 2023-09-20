package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.myprojectactivity.R

class kalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val angka1 : EditText =  findViewById(R.id.inputAngka1)
        val angka2 : EditText =  findViewById(R.id.inputAngka2)

        val btntambah : Button = findViewById(R.id.btnCount)
        val btnkurang : Button = findViewById(R.id.btnCount2)
        val btnpersen : Button = findViewById(R.id.btnCount3)

        val btnkali : Button = findViewById(R.id.btnCount4)
        val btbagi : Button = findViewById(R.id.btnCount5)
        val btnclear : Button = findViewById(R.id.btnCount6)

        val hasil : TextView = findViewById(R.id.hasilJawaban)

        val builder: AlertDialog.Builder =
            AlertDialog.Builder(this@kalkulatorActivity)

        btntambah.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = (a1+a2)

            hasil.setText(hasiltambah.toString())
        }

        btnkurang.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1-a2

            hasil.setText(hasiltambah.toString())
        }

        btnpersen.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1%a2

            hasil.setText(hasiltambah.toString())
        }

        btnkali.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1*a2

            hasil.setText(hasiltambah.toString())
        }

        btbagi.setOnClickListener{

            var a1  = angka1.text.toString().toFloat()
            var a2  = angka2.text.toString().toFloat()


            var hasiltambah   = a1 / a2

            hasil.setText(hasiltambah.toString())
        }

        btnclear.setOnClickListener{

            builder.setTitle("Perhatian!")
            builder.setMessage("Kamu yakin ingin menghapus semua data?")
            builder.setCancelable(false)

            builder.setPositiveButton("Yes",DialogInterface.OnClickListener{ dialog, which ->
                angka1.setText("")
                angka2.setText("")
            })

            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })

            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = 0

            hasil.setText(hasiltambah.toString())
        }
    }
}