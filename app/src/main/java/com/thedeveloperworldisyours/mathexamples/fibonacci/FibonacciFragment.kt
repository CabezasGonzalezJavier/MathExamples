package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.thedeveloperworldisyours.mathexamples.R
import com.thedeveloperworldisyours.mathexamples.R.*
import com.thedeveloperworldisyours.mathexamples.R.id.most_fragment_edit_text
import com.thedeveloperworldisyours.mathexamples.R.layout.fibonacci_fragment

import kotlinx.android.synthetic.main.fibonacci_app_bar.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FibonacciFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FibonacciFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FibonacciFragment(protected var presenter: FibonacciContract.Presenter) : Fragment(), FibonacciContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return container?.inflate(fibonacci_fragment)
    }

    fun ViewGroup.inflate(layoutId: Int): View {
        return LayoutInflater.from(context).inflate(layoutId, this, false)
    }

    override fun showList(finalResult: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(presenter: FibonacciContract.Presenter) {
    }


    fun onClickButton(view : View) {
        presenter.getData(most_fragment_edit_text.toString())
    }

    companion object {

        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }

    }

}// Required empty public constructor
