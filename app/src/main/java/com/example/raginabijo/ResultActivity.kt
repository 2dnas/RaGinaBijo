package com.example.raginabijo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultButton.setOnClickListener{
            val intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        correctAnswersTextView.text = "$totalQuestions დან გაეცი $correctAnswers საღოლ მაგარი შედეგია ბრატ საღოლ"
    }
}