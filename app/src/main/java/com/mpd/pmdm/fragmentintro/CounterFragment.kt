package com.mpd.pmdm.fragmentintro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class CounterFragment : Fragment() {
    var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val counterValue = view.findViewById<TextView>(R.id.counter_value)
        view.findViewById<Button>(R.id.plus)
            .setOnClickListener {
                counter++
                counterValue.text = counter.toString()
            }
        view.findViewById<Button>(R.id.minus)
            .setOnClickListener {
                if (counter > 0) {
                    counter--
                    counterValue.text = counter.toString()
                }
            }
    }
}