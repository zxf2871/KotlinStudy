package com.study.b8a3.kotlin.view

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Created by B8A3 on 2017/9/15.
 */

class MyView : View {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}
}
