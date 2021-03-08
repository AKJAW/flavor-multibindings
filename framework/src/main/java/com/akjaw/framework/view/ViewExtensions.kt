package com.akjaw.framework.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflateLayout(@LayoutRes layout: Int): View =
    LayoutInflater.from(context)
        .inflate(layout, this, false)
