package com.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity5: AppCompatActivity(), View.OnClickListener {

    private var mmCurrentPosition: Int = 1
    private var mmQuestionsList: ArrayList<Question>? = null

    private var mmSelectedOptionPosition: Int = 0
    private var mmCorrectAnswers: Int = 0

    private var mmUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_quiz_questions)

        mmUserName = intent.getStringExtra(Constants.USER_NAME)

        mmQuestionsList = Constants.getQuestions5()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit -> {
                if (mmSelectedOptionPosition == 0) {
                    mmCurrentPosition++
                    when {
                        mmCurrentPosition <= mmQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent =
                                Intent(this@QuizQuestionsActivity5, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mmUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mmCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mmQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mmQuestionsList?.get(mmCurrentPosition - 1)

                    if (question!!.correctAnswer != mmSelectedOptionPosition) {
                        answerView(mmSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else {
                        mmCorrectAnswers++
                    }

                    // This is for correct answer
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mmCurrentPosition == mmQuestionsList!!.size) {
                        btn_submit.text = "เสร็จสิ้น"
                    } else {
                        btn_submit.text = "ข้อต่อไป"
                    }

                    mmSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun setQuestion() {

        val question = mmQuestionsList!!.get(mmCurrentPosition - 1)

        defaultOptionsView()

        if (mmCurrentPosition == mmQuestionsList!!.size) {
            btn_submit.text = "เสร็จสิ้น"
        } else {
            btn_submit.text = "ยืนยัน"
        }

        tv_progress.text = "$mmCurrentPosition" + "/" + "10"

        tv_question.text = question.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mmSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@QuizQuestionsActivity5,
            R.drawable.selected_option_border_bg
        )
    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@QuizQuestionsActivity5,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity5,
                    drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity5,
                    drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity5,
                    drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity5,
                    drawableView
                )
            }
        }
    }
}