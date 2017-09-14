package com.study.b8a3.kotlin.base

import android.app.Activity
import java.util.*

/**
 * Created by B8A3 on 2017/4/9.
 */

object ActivityController {
    private val sList = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        if (sList.contains(activity)) {
            return
        }
        sList.add(activity)
    }

    fun removeActivity(activity: Activity) {
        if (sList.contains(activity)) {
            sList.remove(activity)
        }
    }

    fun finishAll() {
        sList.filter { !it.isFinishing }
                .onEach { it.finish() }
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}
