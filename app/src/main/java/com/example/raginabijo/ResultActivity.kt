package com.example.raginabijo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private val LEVEL_COMPLETION = "level_completion"
    private val CURRENT_LEVEL = "level "
    private val LEVEL_POSITION = "level_position"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val sharedPref = this.getSharedPreferences(LEVEL_COMPLETION, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        resultButton.setOnClickListener {
            val intent = Intent(this, LevelActivity::class.java)
            startActivity(intent)
        }
        val totalQuestions = intent.getIntExtra(Level1Questions.TOTAL_QUESTION, 0)
        val correctAnswers = intent.getIntExtra(Level1Questions.CORRECT_ANSWERS, 0)
        val levelPosition = intent.getIntExtra(LEVEL_POSITION,1)

        if (correctAnswers >= 7) {
            correctAnswersTextView.text =
                "$totalQuestions დან გაეცი $correctAnswers ლეველი გადალახუ₾ია საღოლ"
            editor.putString(CURRENT_LEVEL + (levelPosition+1) ,"Level ${levelPosition + 1 } Completed").apply()
        } else {
            correctAnswersTextView.text =
                "$totalQuestions დან გაეცი $correctAnswers რაარი ტოო? დავაი თავიდან"

        }

    }
}