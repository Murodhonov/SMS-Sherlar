package com.example.uz_poems

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_menu.view.*

class MenuFragment : Fragment() {
    private lateinit var root: View
    private lateinit var a:Animation

    inner class MyClass:Thread(){
        override fun run() {
            sleep(2000)
            root.image123.startAnimation(a)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root =  inflater.inflate(R.layout.fragment_menu, container, false)

        a = AnimationUtils.loadAnimation(context,R.anim.scale)

        MyClass().start()

        a.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                findNavController().navigate(R.id.homeFragment)
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })

        return root
    }

}