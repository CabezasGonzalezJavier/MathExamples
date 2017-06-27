package com.thedeveloperworldisyours.mathexamples.most

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thedeveloperworldisyours.mathexamples.R
import com.thedeveloperworldisyours.mathexamples.commons.inflate


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
        return container?.inflate(R.layout.fragment_most)
    }

    companion object {
        fun newInstance(): com.thedeveloperworldisyours.mathexamples.most.MostFragment {
            return com.thedeveloperworldisyours.mathexamples.most.MostFragment()
        }
    }
}// Required empty public constructor
