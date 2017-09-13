package com.study.b8a3.kotlin.activity

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.study.b8a3.kotlin.R
import com.study.b8a3.kotlin.base.BaseActivity
import com.study.b8a3.kotlin.bean.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {

    private var mFirstTV: TextView? = null
    private var mDataRev: RecyclerView? = null
    private var mPerson = Person("Jim", 20, "www.url")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFirstTV = findViewById(R.id.tv_first) as TextView
        mDataRev = findViewById(R.id.rev_data) as RecyclerView
        mBtnTest.setOnClickListener(this)
        mFirstTV!!.setOnClickListener{toast("click")}
    }

    override fun onClick(v: View?) {
        toast("${mBtnTest.text} ${mPerson.name}")
        SLog(mBtnTest.text)
        SLog(mBtnTest.text, "TEST")
        SLog(mBtnTest.text, "TEST", 4)
        mFirstTV?.text = "HELLO KOTLIN!"

    }
}
