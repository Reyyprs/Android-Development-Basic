package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myprojectactivity.R

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        // Deklarasi Variabel
        val tvNumber:TextView = findViewById(R.id.tvNumber)
        val btnCount:Button = findViewById(R.id.btnCount)
        val btnCount2:Button = findViewById(R.id.btnCount2)
        val btnCount3:Button = findViewById(R.id.btnCount3)

        // panggil fungsi
        // setText dan getText
        // setText = merubah/mengisi text, cukup panggil fungsi text
        tvNumber.text = "100"

        // getText = mengambil text/isi data
        println(tvNumber.text)
        Log.d("Number", "Hasilnya : ${tvNumber.text}")

        // action
        btnCount2.setOnClickListener {
            // bikin variabel nilainya berubah
            // ambil text lalu konversi dari string ke integer
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger++

            // setText
            tvNumber.text = countInteger.toString()
        }
        btnCount.setOnClickListener {
            tvNumber.text = "0"
        }
        btnCount3.setOnClickListener {
            // bikin variabel nilainya berubah
            // ambil text lalu konversi dari string ke integer
            var countInteger :Int = tvNumber.text.toString().toInt()
            countInteger--

            // setText
            tvNumber.text = countInteger.toString()
        }
    }
}