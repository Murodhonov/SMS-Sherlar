package com.example.uz_poems

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.uz_poems.Cache.Cache
import com.example.uz_poems.Cache.Data
import com.example.uz_poems.Modles.MyClass
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    private lateinit var root: View

    override fun onStart() {
        super.onStart()

        val temp = ArrayList<MyClass>()
        for (i in Cache.array1List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array2List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array3List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array4List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array5List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array6List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }

        root.countFavorite.text = temp.size.toString()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        Cache.init(root.context)

        Data.iExit = true


        val temp = ArrayList<MyClass>()
        for (i in Cache.array1List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array2List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array3List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array4List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array5List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }
        for (i in Cache.array6List) {
            if (i.isLiked) {
                temp.add(i)
            }
        }


        val handler = Handler()
        val handler2 = Handler()

        if (Data.isFirst){
            Data.isFirst = false
            var count = temp.size
            var count2 = 122
            var i = 1
            var i2 = 1

            handler.post(object : Runnable {
                override fun run() {
                    countFavorite.text = i.toString()

                    if (count != i) {
                        handler.postDelayed(this, 10)
                    }
                    i++
                }
            })
            handler2.post(object : Runnable {
                override fun run() {
                    Count2.text = i2.toString()
                    i2++
                    if (count2 != i2) {
                        handler2.postDelayed(this, 10)
                    }
                }
            })
        }

        root.card11.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_right)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 0),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)

        }

        root.card2.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 1),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }

        root.card3.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 2),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }

        root.card4.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 3),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }

        root.card5.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 4),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }

        root.card6.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 5),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }
        root.favoriteLinear.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 6),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }
        root.newsLinear.setOnClickListener {
            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.enter_from_left)
            navOption.setPopExitAnim(R.anim.exit_from_left)
            findNavController().navigate(R.id.poemsFragment, bundleOf("key" to 7),navOption.build())
            handler.removeCallbacksAndMessages(null)
            handler2.removeCallbacksAndMessages(null)
        }
        return root
    }
    private fun goPage(i:Int,handler:Handler,handler2:Handler){
        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.enter_from_left)
        navOption.setPopExitAnim(R.anim.exit_from_left)
        findNavController().navigate(R.id.poemsFragment, bundleOf("key" to i),navOption.build())
        handler.removeCallbacksAndMessages(null)
        handler2.removeCallbacksAndMessages(null)
    }
}