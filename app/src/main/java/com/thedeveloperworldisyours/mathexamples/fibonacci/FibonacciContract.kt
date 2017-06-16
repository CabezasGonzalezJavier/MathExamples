package com.thedeveloperworldisyours.mathexamples.fibonacci

import com.thedeveloperworldisyours.mathexamples.BaseView



/**
 * Created by javierg on 15/06/2017.
 */
class FibonacciContract {

    internal interface View : BaseView<Presenter> {
        fun showList(finalResult: String)
    }

    interface Presenter {
        fun getData(number : String)
//        fun convertDate(listDate: List<String>): List<String>

    }
}