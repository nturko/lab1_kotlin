package com.example.lab2_kotlin

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.answer_fragment.*

class AnswerFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.answer_fragment, container, false)
    }

    fun setText(result: String) {
        if(result == R.string.choose_options_of_task.toString()) {
            answer.text = getString(R.string.choose_options_of_task)
        }
        else {
            answer.text =  result
        }
    }
}