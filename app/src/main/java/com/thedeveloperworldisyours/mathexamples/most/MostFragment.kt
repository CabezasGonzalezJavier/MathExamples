package com.thedeveloperworldisyours.mathexamples.most

import android.support.v4.app.Fragment


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MostFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MostFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MostFragment : android.support.v4.app.Fragment() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?,
                              savedInstanceState: android.os.Bundle?): android.view.View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(com.thedeveloperworldisyours.mathexamples.R.layout.fragment_most, container, false)
    }

    companion object {
        fun newInstance(): com.thedeveloperworldisyours.mathexamples.most.MostFragment {
            return com.thedeveloperworldisyours.mathexamples.most.MostFragment()
        }
    }
}// Required empty public constructor
