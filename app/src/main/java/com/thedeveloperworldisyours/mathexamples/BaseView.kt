package com.thedeveloperworldisyours.mathexamples

import com.thedeveloperworldisyours.mathexamples.fibonacci.FibonacciContract

/**
 * Created by javierg on 15/06/2017.
 */
interface BaseView<T> {
    fun setPresenter(presenter: FibonacciContract.Presenter?)
}