package com.example.trivia17ods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.trivia17ods.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var databinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        databinding.button1.setOnClickListener {
           databinding.textprincipal.text="databinding"
        }
    }
}