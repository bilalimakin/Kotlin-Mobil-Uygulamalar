package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class FragmentKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_kotlin)
    }

    //add ve replace

    /*
     * add fragmanları üstüste ekler
     * replace önceki fragmanı kapatarakk fragmanı açar
     *

    fun ilkFragman(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val  ilkFragman = BlankFragment()
        fragmentTransaction.add(R.id.frameLayout,ilkFragman).commit()
    }

    fun sonrakiFragman(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val  sonrakiFragman = BlankFragment2()
        fragmentTransaction.add(R.id.frameLayout,sonrakiFragman).commit()

    }
    * */

    fun ilkFragman(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val  ilkFragman = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,ilkFragman).commit()
    }

    fun sonrakiFragman(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val  sonrakiFragman = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,sonrakiFragman).commit()

    }
}