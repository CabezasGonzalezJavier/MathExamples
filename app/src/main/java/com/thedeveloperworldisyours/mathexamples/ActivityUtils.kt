package com.thedeveloperworldisyours.mathexamples

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * Created by javierg on 15/06/2017.
 */
class ActivityUtils {

    companion object {
        fun addFragmentToActivity(fragmentManager: FragmentManager,
                                  fragment: Fragment, frameId: Int) {
            checkNotNull(fragmentManager)
            checkNotNull(fragment)
            val transaction = fragmentManager.beginTransaction()
            transaction.add(frameId, fragment)
            transaction.commit()
        }
    }
}