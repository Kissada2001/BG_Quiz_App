package com.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level.*

class Level : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        level_easy.setOnClickListener {
            startActivity(Intent(this@Level, QuizQuestionsActivity::class.java))

        }
        level_medium.setOnClickListener {
            startActivity(Intent(this@Level, QuizQuestionsActivity2::class.java))

        }
        level_hard.setOnClickListener {
            startActivity(Intent(this@Level, QuizQuestionsActivity3::class.java))

        }
    }
}