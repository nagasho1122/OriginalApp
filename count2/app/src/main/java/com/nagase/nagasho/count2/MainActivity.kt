package com.nagase.nagasho.count2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//レイアウトをxmlと紐付け。Rはリソース
        val preview = Intent(this,quizcount::class.java)
        var count:Int = 0
        var imagecount = 0

        if(count==0){minusButton.isEnabled=false}

        plusButton.setOnClickListener{
            count+=1
            minusButton.isEnabled=true
            countText.text=count.toString()
            imageView.load("")
            when {
                count%3==0 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
                count%10==3 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
                count/10==3 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
            }
            if (count==100){
                count=0
                countText.text=count.toString()
                imageView.load("")
                minusButton.isEnabled=false
            }
        }
        minusButton.setOnClickListener {
            count -= 1
            countText.text = count.toString()
            imageView.load("")
            if(count==0){minusButton.isEnabled=false}
            when {
                count % 3 == 0 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
                count % 10 == 3 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
                count / 10 == 3 -> {
                    imageView.load(R.drawable.nabeatsu){
                        transformations(CircleCropTransformation())
                    }
                    imagecount+=1
                }
            }
        }
        resetButton.setOnClickListener{
            count=0
            countText.text=count.toString()
            imageView.load("")
            imagecount=0
            minusButton.isEnabled=false
        }
        quizButton.setOnClickListener{
            preview.putExtra("number",imagecount)
            startActivity(preview)
            finish()
        }
    }
}