package com.nagase.nagasho.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //画面を遷移させる関数
        val quizIntent: Intent = Intent(this, quizActivity::class.java)

        //画面の遷移
        startButton.setOnClickListener{
            startActivity(quizIntent)
        }
    }
}