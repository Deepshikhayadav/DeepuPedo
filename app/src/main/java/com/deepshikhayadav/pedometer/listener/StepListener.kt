package com.deepshikhayadav.pedometer.listener

interface StepListener {
    fun step(timeNs: Long)
}