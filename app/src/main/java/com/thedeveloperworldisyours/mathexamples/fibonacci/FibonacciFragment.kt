package com.thedeveloperworldisyours.mathexamples.fibonacci

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.thedeveloperworldisyours.mathexamples.R




/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FibonacciFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FibonacciFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FibonacciFragment : Fragment(), FibonacciContract.View {

    var presenter: FibonacciContract.Presenter
    var editText : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fibonacci_fragment, container, false)
        editText = view.findViewById(R.id.most_fragment_edit_text) as EditText

        return view
    }

    override fun showList(finalResult: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun setPresenter(presenter: FibonacciContract.Presenter?) {
    }


    fun onClickButton(view : View) {
        presenter.getData(editText.toString())
    }

    companion object {

        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }

    }

}// Required empty public constructor
