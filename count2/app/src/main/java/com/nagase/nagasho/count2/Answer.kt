package com.nagase.nagasho.count2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_answer.*
import kotlinx.android.synthetic.main.activity_main.*

class Answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        imageView4.load(R.drawable.nabeatsu){
            transformations(CircleCropTransformation())
        }

        val answer = intent.getStringExtra("result")

        if (answer=="true"){
            answerImage.setImageResource(R.drawable.correct_image)
            comment.text="やるじゃん！"
        }else{
            answerImage.setImageResource(R.drawable.miss_image)
            comment.text="残念。再挑戦を待ってるぜ！"
        }
        returnButton.setOnClickListener{
            val main = Intent(this,MainActivity::class.java)
            startActivity(main)
            finish()
        }
    }
}

