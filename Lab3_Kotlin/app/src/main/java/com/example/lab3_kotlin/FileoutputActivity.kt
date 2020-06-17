package com.example.lab3_kotlin


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fileoutput.*

class FileoutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fileoutput)
        val text = intent.getStringExtra("text")
        val filename = intent.getStringExtra("filename")
        SetOutputTextSetup(text, filename)
    }

    fun SetOutputTextSetup(text: String, filename: String){
        outputTextView.text = "Read from ${filename} choice was: ${text}"
    }
}