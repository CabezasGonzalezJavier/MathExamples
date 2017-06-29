package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thedeveloperworldisyours.mathexamples.R.layout.fibonacci_fragment
import com.thedeveloperworldisyours.mathexamples.commons.inflate
import kotlinx.android.synthetic.main.fibonacci_fragment.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FibonacciFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FibonacciFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FibonacciFragment() : Fragment(), FibonacciContract.View {

    private var presenter: FibonacciContract.Presenter? =null

    override fun setPresenter(presenter: FibonacciContract.Presenter) {
        this.presenter = presenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val number = most_fragment_edit_text.text

        return container?.inflate(fibonacci_fragment)
    }

    override fun showList(finalResult: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




    fun onClickButton(view : View) {
//        presenter.getDataFromPresenter(most_fragment_edit_text.toString())
    }

    companion object {

        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }

    }

}// Required empty public constructor
