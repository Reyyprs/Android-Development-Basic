package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myprojectactivity.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm: TextView = findViewById(R.id.judulForm)

        val labelNama: TextView = findViewById(R.id.labelNama)
        val inputNama: EditText = findViewById(R.id.inputNama)

        val labelKelas: TextView = findViewById(R.id.labelKelas)
        val inputKelas: EditText = findViewById(R.id.inputKelas)

        val labelKodeBuku: TextView = findViewById(R.id.labelKodeBuku)
        val inputKodeBuku: EditText = findViewById(R.id.inputKodeBuku)

        val btnSubmit: Button = findViewById(R.id.btnSubmit)

        val tampilkanNama: TextView = findViewById(R.id.tampilkanNama)
        val tampilkanKelas: TextView = findViewById(R.id.tampilkanKelas)
        val tampilkanBuku: TextView = findViewById(R.id.tampilkanBuku)

        btnSubmit.setOnClickListener {
            Toast.makeText(
                this, "Kamu meminjam buku ${tampilkanBuku.text}",
                Toast.LENGTH_SHORT
            ).show()
            tampilkanNama.text = inputNama.text
            tampilkanKelas.text = inputKelas.text

            val kode: Int = inputKodeBuku.text.toString().toInt()

            when (kode) {
                123 -> tampilkanBuku.text = "Harry Potter"
                456 -> tampilkanBuku.text = "Alice In Wonderland"
                789 -> tampilkanBuku.text = "Vinland Saga"
                else -> tampilkanBuku.text = "Hasil tidak ditemukan"
            }
        }
    }
}