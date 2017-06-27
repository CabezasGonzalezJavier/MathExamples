package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thedeveloperworldisyours.mathexamples.R.id.most_fragment_edit_text
import com.thedeveloperworldisyours.mathexamples.R.layout.fibonacci_fragment
import com.thedeveloperworldisyours.mathexamples.commons.inflate

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FibonacciFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FibonacciFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FibonacciFragment(var presenter: Any) : Fragment(), FibonacciContract.View {

    override fun setPresenter(presenter: FibonacciContract.Presenter) {
        this.presenter = presenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

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
