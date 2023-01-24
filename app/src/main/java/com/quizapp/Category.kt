package com.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_category.*


class Category : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        category_t.setOnClickListener {
            startActivity(Intent(this@Category, Level::class.java))
        }
        category_f.setOnClickListener {
            startActivity(Intent(this@Category, Level2::class.java))
        }
    }
}