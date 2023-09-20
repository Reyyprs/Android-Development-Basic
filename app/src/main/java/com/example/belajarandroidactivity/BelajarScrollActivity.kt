package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.myprojectactivity.R
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollActivity : AppCompatActivity() {

    var ivBackground: ImageView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll)

        ivBackground = findViewById(R.id.ivBackground)

        Glide.with(this)
            .load(R.drawable.background)
            .transform(BlurTransformation(25, 3))
            .into(ivBackground!!)
    }
}