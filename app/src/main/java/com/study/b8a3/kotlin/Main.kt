package com.study.b8a3.kotlin

/**
 * Created by zhaoxinfu on 2017/9/14.
 */

class MapTest(var mapParam: Map<String, Any?>) {
    val width: Int by mapParam
    val height: Int by mapParam
    val dp: Int by mapParam
    val deviceName: String by mapParam

}

var map = mapOf<String, Any?>(
        "width" to 1080,
        "height" to 720,
        "dp" to 240,
        "deviceName" to "mydevice"
)

var mapTest = MapTest(map)
