package com.nagase.nagasho.calculator

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firstNumber = 0
    var secondNumber = 0
    var totalNumber = 0
    var operator = "empty" //畚の入力状態を持つ変数。最初はempty（空）

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

        plusButton.isEnabled = false
        minusButton.isEnabled = false
        multiplyButton.isEnabled = false
        equalButton.isEnabled = false

        numberText.text = firstNumber.toString()

        numberButton0.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }

        numberButton1.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+1

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+1
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton2.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+2

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+2
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton3.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+3

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+3
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton4.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+4

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+4
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton5.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+5

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+5
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton6.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+6

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+6
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton7.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+7

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+7
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton8.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+8

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+8
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        numberButton9.setOnClickListener{
            if(operator == "empty"){
                firstNumber = firstNumber*10+9

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = true

            }else{
                secondNumber = secondNumber*10+9
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            }
        }
        plusButton.setOnClickListener{
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "plus"
            numberText.text = secondNumber.toString()
        }
        minusButton.setOnClickListener{
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "minus"
            numberText.text = secondNumber.toString()
        }
        multiplyButton.setOnClickListener{
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "multiply"
            numberText.text = secondNumber.toString()
        }
        equalButton.setOnClickListener{
            if (operator == "plus"){
                totalNumber = firstNumber + secondNumber
            } else if (operator == "minus"){
                totalNumber = firstNumber - secondNumber
            } else if (operator == "multiply") {
                totalNumber = firstNumber * secondNumber
            }
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber = 0
            secondNumber = 0
            operator = "empty"
            numberText.text = totalNumber.toString()
        }
        clearButton.setOnClickListener{
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            firstNumber = 0
            secondNumber = 0
            totalNumber = 0
            operator = "empty"
            numberText.text = totalNumber.toString()
        }
    }
}