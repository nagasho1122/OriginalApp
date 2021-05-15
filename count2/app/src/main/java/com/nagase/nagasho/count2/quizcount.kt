package com.nagase.nagasho.count2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quizcount.*

class quizcount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizcount)

        val answer = intent.getIntExtra("number",0).toString()
        val preview = Intent(this,Answer::class.java)

        imageView2.load(R.drawable.nabeatsu){
            transformations(CircleCropTransformation())
        }

        submitButton.setOnClickListener{
            val yourAnswer = quizNumber.text.toString()
            var result = "false"
            if (yourAnswer == answer){
                result="true"
            }
            preview.putExtra("result",result)
            startActivity(preview)
            finish()
        }

    }
}