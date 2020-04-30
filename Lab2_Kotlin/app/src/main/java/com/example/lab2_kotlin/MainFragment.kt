package com.example.lab2_kotlin

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_fragment.*

interface OnFragmentInteractionListener {
    fun onFragmentInteraction(result: String)
}

class MainFragment : Fragment() {

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListener()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    private fun setOnClickListener() {
        button.setOnClickListener{
            val id1: Int = radio_group1.checkedRadioButtonId
            val id2: Int = radio_group2.checkedRadioButtonId
            var result = ""

            if(id1!=-1) {
                when {
                    rb_low.isChecked -> result += "Selected difficulty: low\n"
                    rb_medium.isChecked -> result += "Selected difficulty: medium\n"
                    rb_high.isChecked -> result += "Selected difficulty: high\n"
                }
            }
            else result += "You need to choose the difficulty of tasks!\n"

            if(id2!=-1) {
                when {
                    rb_practice.isChecked -> result += "Selected type of tasks: practice\n"
                    rb_theory.isChecked -> result += "Selected type of tasks: theory\n"
                }
            }
            else result += "You need to choose the type of tasks!\n"


            listener?.onFragmentInteraction(result)
        }
    }




}
