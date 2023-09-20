package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectactivity.R

class LatihanListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        // define array adapter
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "1.Phyton","2.C#","3.C++","4.JavaScript","5.PHP","6.Swift","7.Java","8.Go","9.SQL","10.Ruby"
        )
        // deklarasikan variabel listview
        var mListView: ListView = findViewById(R.id.rvBahasaPemrograman)
        // panggil objek ArrayAdapter(this,layout_sample,data)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
        // isi adapter
        mListView.adapter = arrayAdapter
    }
}