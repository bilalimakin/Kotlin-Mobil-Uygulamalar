package com.example.farkliaktiviteler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SecondFragman : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_fragman, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val oncekiButton = view.findViewById<Button>(R.id.onceki)

        oncekiButton.setOnClickListener {
            val action = SecondFragmanDirections.actionSecondFragmanToFirstFragman()
            Navigation.findNavController(view).navigate(action)
        }
    }
}