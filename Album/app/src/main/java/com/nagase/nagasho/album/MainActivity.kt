package com.nagase.nagasho.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this,PreviewActivity::class.java)

        albumImage2.setOnClickListener{
            preview.putExtra("image",R.drawable.cat_image)
            preview.putExtra("title","猫")
            startActivity(preview)
        }
        albumImage3.setOnClickListener{
            preview.putExtra("image",R.drawable.dog_image)
            preview.putExtra("title","子犬")
            startActivity(preview)
        }
        albumImage4.setOnClickListener{
            preview.putExtra("image",R.drawable.cake_image)
            preview.putExtra("title","ケーキ")
            startActivity(preview)
        }
        albumImage5.setOnClickListener{
            preview.putExtra("image",R.drawable.night_image)
            preview.putExtra("title","夜景")
            startActivity(preview)
        }
        albumImage6.setOnClickListener{
            preview.putExtra("image",R.drawable.flower_image)
            preview.putExtra("title","桜")
            startActivity(preview)
        }
    }
}