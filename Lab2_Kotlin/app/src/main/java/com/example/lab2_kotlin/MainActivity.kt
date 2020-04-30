package com.example.lab2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), OnFragmentInteractionListener {

    override fun onFragmentInteraction(result: String) {
        var fragment = supportFragmentManager.findFragmentById(R.id.answerFragment) as AnswerFragment
        if(fragment.isInLayout){
            fragment.setText(result)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

}
