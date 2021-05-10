package com.nagase.nagasho.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //他のactivityから値の受け渡し
        val quizCount: Int = intent.getIntExtra("quizCount",0)
        quizCountText.text = "$quizCount 問中・・・" //変数と文字を同時に代入

        val correctCount: Int = intent.getIntExtra("correctCount",0)
        correctCountText.text = correctCount.toString()

        againButton.setOnClickListener{
            val quizIntent: Intent = Intent(this, quizActivity::class.java)
            startActivity(quizIntent) //activityの遷移
        }
    }

}