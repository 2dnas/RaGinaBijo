package com.example.raginabijo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        startButton.setOnClickListener {
            if(nameEditText.text.toString().isEmpty()){
                Toast.makeText(this, "შეიყვანეთ სახელი გეთაყვა" , Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent(this, LevelActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}