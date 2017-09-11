package com.study.b8a3.kotlin
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

//    val mFirstTV:TextView = tv_first

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 //       mFirstTV = findViewById(R.id.tv_first)
//        mFirstTV.text = "HELLO KOTLIN!"
        tv_first.text = "HELLO KOTLIN!"
    }
}
