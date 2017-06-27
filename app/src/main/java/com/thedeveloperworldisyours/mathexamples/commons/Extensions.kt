@file:JvmName("ExtensionsUtils")

package com.thedeveloperworldisyours.mathexamples.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by javierg on 27/06/2017.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}