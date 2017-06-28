package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.content.Context

/**
 * Created by javierg on 15/06/2017.
 */
class FibonacciPresenter private constructor(var view: FibonacciContract.View) : FibonacciContract.Presenter {

    var n1 = 0
    var n2 = 1
    var n3 = 0

    internal constructor(view: FibonacciContract.View, context: Context) : this(view) {
        this.view = view
        view.setPresenter(this)
    }

    override fun calculate(number : String) {

        val count = 10
        this.view.showList(n1.toString() + " " + n2)//printing 0 and 1
        printFibonacci(count - 2)//n-2 because 2 numbers are already printed
    }

    fun printFibonacci(count: Int) {
        if (count > 0) {
            n3 = n1 + n2
            n1 = n2
            n2 = n3
            print(" " + n3)
            printFibonacci(count - 1)
        }


    }

}