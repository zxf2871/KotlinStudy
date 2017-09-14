package com.study.b8a3.kotlin.activity

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.study.b8a3.kotlin.B8A3Application
import com.study.b8a3.kotlin.R
import com.study.b8a3.kotlin.base.BaseActivity
import com.study.b8a3.kotlin.bean.Person
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : BaseActivity(), View.OnClickListener {

    val mFirstTV by lazy { findViewById(R.id.tv_first) as TextView }
    private var mDataRev: RecyclerView? = null
    //    private var mDataRev by Delegates.notNull<RecyclerView>()
    private var mPerson:Person? = Person("Jim", 20, "www.url")
    private var mPerson1 = mPerson?.copy(age = 21)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mFirstTV = findViewById(R.id.tv_first) as TextView
        mDataRev = findViewById(R.id.rev_data) as RecyclerView
        mDataRev?.adapter
        mBtnTest.setOnClickListener(this)
        mFirstTV.setOnClickListener { toast("${mBtnTest.text} ${mPerson?.name} ${mPerson1?.equals(mPerson1)}") }
    }

    override fun onClick(v: View?) {
        SLog(mBtnTest.text, "TEST", 4)
        mFirstTV.text = "HELLO KOTLIN!"

        B8A3Application.instance()

        Thread({SLog(mBtnTest.text, "------>")}).start()

//        Thread(start = true){SLog(mBtnTest.text, "------>")}.start()
    }


}
