package com.example.farkliaktiviteler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation


class SecondFragman : Fragment() {

    lateinit var fragman2: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_second_fragman, container, false)
        fragman2 = rootView.findViewById(R.id.fragman2) // TextView öğesine erişim sağlanıyor
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val kullaniciadi = SecondFragmanArgs.fromBundle(it).username
            fragman2.text = kullaniciadi
        }

        val oncekiButton = view.findViewById<Button>(R.id.onceki)

        oncekiButton.setOnClickListener {
            val action = SecondFragmanDirections.actionSecondFragmanToFirstFragman()
            Navigation.findNavController(view).navigate(action)
        }
    }
}
