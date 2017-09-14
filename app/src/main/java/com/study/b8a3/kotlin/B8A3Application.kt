package com.study.b8a3.kotlin

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created by zhaoxinfu on 2017/9/14.
 */
class B8A3Application : Application() {
    companion object {
        private var instance:B8A3Application by Delegates.notNull<B8A3Application>()
        fun instance() = instance
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}