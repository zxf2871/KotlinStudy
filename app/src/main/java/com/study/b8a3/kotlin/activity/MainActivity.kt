package com.study.b8a3.kotlin.activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.study.b8a3.kotlin.R
import com.study.b8a3.kotlin.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : BaseActivity(), View.OnClickListener {

    private val mFirstTV = findViewById(R.id.tv_first) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFirstTV.text = "HELLO KOTLIN!"
        mBtnTest.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        toast(mBtnTest.text)
    }
}
