package com.example.raginabijo

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var currentQuestion: Int = 0
    private var questionList: ArrayList<Question>? = null
    private var selectedOption: Int = 0
    private var buttonSubmitted : Boolean = false
    private var correctAnswers : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        questionList = Constants.getQuestions()
        setQuestion()

        optionOneTextView.setOnClickListener(this)
        optionTwoTextView.setOnClickListener(this)
        optionThreeTextView.setOnClickListener(this)
        optionFourTextView.setOnClickListener(this)
        submitButton.setOnClickListener(this)

    }

    private fun setQuestion() {
        buttonSubmitted = false
        isButtonPressed(buttonSubmitted)
        val question: Question = questionList!![currentQuestion]
        setDefault()

        if(questionList!!.size == (currentQuestion + 1)){
            submitButton.text = "დაასრულეი"
        }else{
            submitButton.text = "დადასტურება"
        }
        progressBar.max = questionList!!.size
        progressBar.progress = currentQuestion
        progressTextView.text = "$currentQuestion/${progressBar.max}"

        questionTextView.text = question.question
        imgImageView.setImageResource(question.img)
        optionOneTextView.text = question.optionOne
        optionTwoTextView.text = question.optionTwo
        optionThreeTextView.text = question.optionThree
        optionFourTextView.text = question.optionFour
    }

    private fun setDefault() {
        val options = ArrayList<TextView>()
        options.add(0, optionOneTextView)
        options.add(1, optionTwoTextView)
        options.add(2, optionThreeTextView)
        options.add(3, optionFourTextView)

        for (option in options) {
            option.typeface = Typeface.DEFAULT
            option.setTextColor(Color.parseColor("#7A8089"))
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.optionOneTextView -> selectedOptionView(optionOneTextView, 1)
            R.id.optionTwoTextView -> selectedOptionView(optionTwoTextView, 2)
            R.id.optionThreeTextView -> selectedOptionView(optionThreeTextView, 3)
            R.id.optionFourTextView -> selectedOptionView(optionFourTextView, 4)
            R.id.submitButton -> {
                buttonSubmitted = true
                isButtonPressed(buttonSubmitted)
                if (selectedOption == 0) {
                    currentQuestion++
                    when {
                        currentQuestion < questionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTION, questionList!!.size)
                            startActivity(intent)
                        }
                    }
                }else {
                    val question = questionList!![currentQuestion]
                    if(question.correctAnswer != selectedOption){
                        answerView(selectedOption, R.drawable.wrong_option_border_bg)
                    }else {
                        correctAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(currentQuestion == questionList!!.size){
                        submitButton.text = "დაასრულეი"
                    }else{
                        submitButton.text = "შემდეგი კითხვაი"
                    }
                }
                selectedOption = 0
            }
        }
    }

    private fun selectedOptionView(textView: TextView, selectedOptionNumber: Int) {
        setDefault()
        selectedOption = selectedOptionNumber

        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                optionOneTextView.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                optionTwoTextView.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                optionThreeTextView.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                optionFourTextView.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }
    private fun isButtonPressed(buttonPressed : Boolean){
        if(buttonPressed){
            optionOneTextView.isEnabled = false
            optionTwoTextView.isEnabled = false
            optionThreeTextView.isEnabled = false
            optionFourTextView.isEnabled = false
        }else{
            optionOneTextView.isEnabled = true
            optionTwoTextView.isEnabled = true
            optionThreeTextView.isEnabled = true
            optionFourTextView.isEnabled = true
        }
    }

}