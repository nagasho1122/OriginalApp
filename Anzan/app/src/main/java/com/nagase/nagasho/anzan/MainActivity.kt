package com.nagase.nagasho.anzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumber1 = Random.nextInt(1000)
        val randomNumber2 = Random.nextInt(1000)

        number1Text.text = randomNumber1.toString()
        number2Text.text = randomNumber2.toString()

        val randomOperator = Random.nextInt(2)
        var operatorText = ""
        var correctAnswer = 0

        if (randomOperator == 0) {
            operatorText="+"
            signText.text = operatorText
            correctAnswer = randomNumber1 + randomNumber2
        }
        else {
            operatorText="-"
            signText.text = operatorText
            correctAnswer = randomNumber1 - randomNumber2
        }
        checkButton.setOnClickListener{
            //入力を受け取る
            val yourAnswer = inputText.text.toString()
            //入力された状態でボタンが押されたら実行
            if (yourAnswer.isNotEmpty()){
                val answerPage = Intent(this,AnswerActivity::class.java)
                val questionText = randomNumber1.toString() + operatorText + randomNumber2 + "="

                answerPage.putExtra("question",questionText)
                answerPage.putExtra("answer",yourAnswer)
                answerPage.putExtra("correct", correctAnswer.toString())
                startActivity(answerPage)
                finish()//クイズ画面を閉じる
            }
        }
    }
}