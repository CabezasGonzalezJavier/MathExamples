package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.content.Context

/**
 * Created by javierg on 15/06/2017.
 */
class FibonacciPresenter private constructor(var view: FibonacciContract.View) : FibonacciContract.Presenter {

    internal constructor(view: FibonacciContract.View, context: Context) : this(view) {
        this.view = view
        view.setPresenter(this)
    }

    override fun calculate(countString: String) {
        val count = countString.toInt()
        val fibonacciArray = IntArray(count)
        fibonacciArray[0] = 0
        fibonacciArray[1] = 1

        for (i in 2..count - 1) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2]
        }
        for (i in 0..count - 1) {
            print(fibonacciArray[i].toString() + " ")
        }
        this.view.showList(fibonacciArray.toString())
    }

}