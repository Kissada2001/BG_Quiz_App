package com.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level.*
import kotlinx.android.synthetic.main.activity_level2.*

class Level2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)
        level_easy2.setOnClickListener {
            startActivity(Intent(this@Level2, QuizQuestionsActivity4::class.java))

        }
        level_medium2.setOnClickListener {
            startActivity(Intent(this@Level2, QuizQuestionsActivity5::class.java))

        }
        level_hard2.setOnClickListener {
            startActivity(Intent(this@Level2, QuizQuestionsActivity6::class.java))

        }
    }
}