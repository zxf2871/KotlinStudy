package com.study.b8a3.kotlin.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast

/**
 * Created by B8A3 on 2017/9/11.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        ActivityController.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityController.removeActivity(this)
    }

    fun toast(message: CharSequence, tag: CharSequence = this@BaseActivity.javaClass.simpleName, lenght: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "$tag $message", lenght).show()
    }

    fun SLog( message: CharSequence,TAG: String = this@BaseActivity.javaClass.simpleName, type: Int = 0) {
        when (type) {
            0 -> Log.v(TAG, "$message")
            1 -> Log.i(TAG, "$message")
            2 -> Log.d(TAG, "$message")
            3 -> Log.w(TAG, "$message")
            4 -> Log.e(TAG, "$message")
        }
    }

}