package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.TextKeyListener.clear
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class MainActivity : AppCompatActivity() { //implementsOnclickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //animalGuessCheckbutton
        btnConfirm.setOnClickListener {
            checkAnswer()
        }
   /* etAnswer.setOnClickListener{
        onClick() test123
    }*/
    }

  /* private fun onClick() {
        etAnswer.getText().clear() //or you can use editText.setText("");
    }*/

    private fun checkAnswer() {
         when (etAnswer.text.toString()== getString(R.string.giraffe)){
            true -> Toast.makeText(this, getString(R.string.correct),Toast.LENGTH_LONG).show()
                false -> Toast.makeText(this, getString(R.string.incorrect),Toast.LENGTH_LONG).show()
        }
    }
}