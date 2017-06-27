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



    override fun getData(number : String) {
        this.view.showList(number)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}