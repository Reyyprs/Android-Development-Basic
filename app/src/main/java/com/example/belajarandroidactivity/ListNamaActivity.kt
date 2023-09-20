package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectactivity.R

class ListNamaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
        // define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith","Ross Taylor","Rohit Sharma"
        )
        // deklarasikan variabel listview
        var mListView: ListView = findViewById(R.id.lvNama)
        // panggil objek ArrayAdapter(this,layout_sample,data)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
        // isi adapter
        mListView.adapter = arrayAdapter
    }
}