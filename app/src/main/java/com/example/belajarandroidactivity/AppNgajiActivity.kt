package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.myprojectactivity.R

class AppNgajiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_ngaji)
        val rvDoa: RecyclerView =
            findViewById(R.id.rvDoa)
        val data = arrayListOf<Doa>(
            Doa("Orang Berdoa",R.drawable.orang_berdoa),
            Doa("Orang Berdoa",R.drawable.orang_berdoa),
            Doa("Orang Berdoa",R.drawable.orang_berdoa),
            Doa("Orang Berdoa",R.drawable.orang_berdoa),
            Doa("Orang Berdoa",R.drawable.orang_berdoa),
            Doa("Orang Berdoa",R.drawable.orang_berdoa)
        )
        val btnSelengkapnya:Button=
            findViewById(R.id.btnSelengkapnya)
        btnSelengkapnya.setOnClickListener {
            val intent=
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
        val adapter = DoaAdapter(data)
        rvDoa.adapter = adapter
        rvDoa.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

    }
}