package com.example.uz_poems

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.ClipboardManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.uz_poems.Adapter.RvAdapter
import com.example.uz_poems.Cache.Cache
import com.example.uz_poems.Cache.Cache.array2List
import com.example.uz_poems.Cache.Cache.array3List
import com.example.uz_poems.Cache.Cache.array4List
import com.example.uz_poems.Cache.Cache.array5List
import com.example.uz_poems.Cache.Cache.array6List
import com.example.uz_poems.Cache.Data
import com.example.uz_poems.Modles.MyClass
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.bottom_menu.view.*
import kotlinx.android.synthetic.main.fragment_poems.*
import kotlinx.android.synthetic.main.fragment_poems.view.*
import kotlinx.android.synthetic.main.rv_item1.view.*
import com.example.uz_poems.Cache.Cache.array1List as array1List1

class PoemsFragment : Fragment() {

    private lateinit var root: View
    private var list = ArrayList<MyClass>()

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Data.iExit = false

        root = inflater.inflate(R.layout.fragment_poems, container, false)

        Cache.init(root.context)

        root.backToHome.setOnClickListener {
            findNavController().popBackStack()
        }

        return root
    }

    override fun onStart() {
        super.onStart()

        when (arguments?.getInt("key")) {
            0 -> {
                list = array1List1
                root.header_title2.text = "sevgi she’rlari"
            }
            7 -> {
                list = array1List1
                root.header_title2.text = "yangi she’rlari"
            }
            1 -> {
                list = array2List
                root.header_title2.text = "so'ginch she’rlari"
            }
            2 -> {
                list = array3List
                root.header_title2.text = "tabrik she’rlari"
            }
            3 -> {
                list = Cache.array4List
                root.header_title2.text = "ota ona she’rlari"
            }
            4 -> {
                list = Cache.array5List
                root.header_title2.text = "do'stlik she’rlari"
            }
            5 -> {
                list = array6List
                root.header_title2.text = "hazil she’rlar"
            }
            6 -> {
                val temp = ArrayList<MyClass>()
                for (i in array1List1) {
                    if (i.isLiked) {
                        temp.add(i)
                    }
                }
                for (i in array2List) {
                    if (i.isLiked) {
                        temp.add(i)
                    }
                }
                for (i in array3List) {
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
                for (i in array6List) {
                    if (i.isLiked) {
                        temp.add(i)
                    }
                }
                list = temp
                root.header_title2.text = "saqlangan\nshe’rlar"
            }
        }

        root.rv.adapter = RvAdapter(object : RvAdapter.clicking {
            override fun click(position: Int, title: String, poem: String, isLike: Boolean) {
                val my = BottomSheetDialog(context!!, R.style.SheetDialog)

                my.setCancelable(false)
                my.setCanceledOnTouchOutside(true)

                val itemView =
                    LayoutInflater.from(context).inflate(R.layout.bottom_menu, null, false)

                itemView.poemName.text = title

                itemView.poemTxt.text = poem

                if (isLike) {
                    itemView.like_img.setImageResource(R.drawable.fill_heart)
                } else {
                    itemView.like_img.setImageResource(R.drawable.icons8_heart_32px)
                }

                itemView.thisIsRoot.startAnimation(
                    AnimationUtils.loadAnimation(
                        context,
                        R.anim.scale2
                    )
                )

                itemView.btn_share.setOnClickListener {
                    val shareIntent = Intent()
                    shareIntent.action = Intent.ACTION_SEND
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "$title - $poem")
                    startActivity(Intent.createChooser(shareIntent, "Do'stlarga ulashish"))
                }

                itemView.btn_send.setOnClickListener {
                    sendSMS("$title - $poem")
                }

                itemView.btn_copy.setOnClickListener {
                    copyCliboard("$title - $poem")
                }

                itemView.btn_like.setOnClickListener {

                    if (list[position].isLiked) {
                        itemView.like_img.setImageResource(R.drawable.icons8_heart_32px)

                        when (arguments?.getInt("key")) {
                            0 -> {
                                list[position].isLiked = false
                                array1List1 = list
                            }
                            1 -> {
                                list[position].isLiked = false
                                array2List = list
                            }
                            2 -> {
                                list[position].isLiked = false
                                array3List = list
                            }
                            3 -> {
                                list[position].isLiked = false
                                array4List = list
                            }
                            4 -> {
                                list[position].isLiked = false
                                array5List = list
                            }
                            5 -> {
                                list[position].isLiked = false
                                array6List = list
                            }
                            6 -> {
                                var a = ArrayList<MyClass>()
                                var pos = -1
                                when (list[position].folder) {
                                    0 -> {
                                        a = array1List1
                                    }
                                    1 -> {
                                        a = array2List
                                    }
                                    2 -> {
                                        a = array3List
                                    }
                                    3 -> {
                                        a = array4List
                                    }
                                    4 -> {
                                        a = array5List
                                    }
                                    5 -> {
                                        a = array6List
                                    }
                                }
                                for (i in a.indices) {
                                    if (a[i].poemName == list[position].poemName && a[i].poem == list[position].poem && a[i].isLiked == list[position].isLiked && a[i].folder == list[position].folder) {
                                        pos = i
                                        a[i].isLiked = false
                                        when (list[position].folder) {
                                            0 -> {
                                                array1List1 = a
                                            }
                                            1 -> {
                                                array2List = a
                                            }
                                            2 -> {
                                                array3List = a
                                            }
                                            3 -> {
                                                array4List = a
                                            }
                                            4 -> {
                                                array5List = a
                                            }
                                            5 -> {
                                                array6List = a
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        onStart()
                    } else {
                        itemView.like_img.setImageResource(R.drawable.fill_heart)
                        val listTemp = list[position]
                        listTemp.isLiked = true
                        list[position] = listTemp

                        when (arguments?.getInt("key")) {
                            0 -> {
                                array1List1 = list
                            }
                            1 -> {
                                array2List = list
                            }
                            2 -> {
                                array3List = list
                            }
                            3 -> {
                                Cache.array4List = list
                            }
                            4 -> {
                                Cache.array5List = list
                            }
                            5 -> {
                                array6List = list
                            }
                            6 -> {
                                var a = ArrayList<MyClass>()
                                var pos = -1
                                when (list[position].folder) {
                                    0 -> {
                                        a = array1List1
                                    }
                                    1 -> {
                                        a = array2List
                                    }
                                    2 -> {
                                        a = array3List
                                    }
                                    3 -> {
                                        a = array4List
                                    }
                                    4 -> {
                                        a = array5List
                                    }
                                    5 -> {
                                        a = array6List
                                    }
                                    6 -> {
                                        var a = ArrayList<MyClass>()
                                        var pos = -1
                                        when (list[position].folder) {
                                            0 -> {
                                                a = array1List1
                                            }
                                            1 -> {
                                                a = array2List
                                            }
                                            2 -> {
                                                a = array3List
                                            }
                                            3 -> {
                                                a = array4List
                                            }
                                            4 -> {
                                                a = array5List
                                            }
                                            5 -> {
                                                a = array6List
                                            }
                                        }
                                        for (i in a.indices) {
                                            if (a[i].poemName == list[position].poemName && a[i].poem == list[position].poem && a[i].isLiked == list[position].isLiked && a[i].folder == list[position].folder) {
                                                pos = i
                                                a[i].isLiked = false
                                                when (list[position].folder) {
                                                    0 -> {
                                                        array1List1 = a
                                                    }
                                                    1 -> {
                                                        array2List = a
                                                    }
                                                    2 -> {
                                                        array3List = a
                                                    }
                                                    3 -> {
                                                        array4List = a
                                                    }
                                                    4 -> {
                                                        array5List = a
                                                    }
                                                    5 -> {
                                                        array6List = a
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        onStart()
                    }
                }

                my.setContentView(itemView)

                my.show()
            }

            override fun favorite(listPos:MyClass,i:ImageView) {
                if (listPos.isLiked) {
                    i.setImageResource(R.drawable.icons8_heart_32px)

                    when (listPos.folder) {
                        0 -> {
                            listPos.isLiked = false
                            Cache.array1List = list
                        }
                        1 -> {
                            listPos.isLiked = false
                            Cache.array2List = list
                        }
                        2 -> {
                            listPos.isLiked = false
                            Cache.array3List = list
                        }
                        3 -> {
                            listPos.isLiked = false
                            Cache.array4List = list
                        }
                        4 -> {
                            listPos.isLiked = false
                            Cache.array5List = list
                        }
                        5 -> {
                            listPos.isLiked = false
                            Cache.array6List = list
                        }
                        6 -> {
                            var a = ArrayList<MyClass>()
                            var pos = -1
                            when (listPos.folder) {
                                0 -> {
                                    a = Cache.array1List
                                }
                                1 -> {
                                    a = Cache.array2List
                                }
                                2 -> {
                                    a = Cache.array3List
                                }
                                3 -> {
                                    a = Cache.array4List
                                }
                                4 -> {
                                    a = Cache.array5List
                                }
                                5 -> {
                                    a = Cache.array6List
                                }
                            }
                            for (i in a.indices) {
                                if (a[i].poemName == listPos.poemName && a[i].poem == listPos.poem && a[i].isLiked == listPos.isLiked && a[i].folder == listPos.folder) {
                                    pos = i
                                    a[i].isLiked = false
                                    when (listPos.folder) {
                                        0 -> {
                                            Cache.array1List = a
                                        }
                                        1 -> {
                                            Cache.array2List = a
                                        }
                                        2 -> {
                                            Cache.array3List = a
                                        }
                                        3 -> {
                                            Cache.array4List = a
                                        }
                                        4 -> {
                                            Cache.array5List = a
                                        }
                                        5 -> {
                                            Cache.array6List = a
                                        }
                                    }
                                }
                            }
                        }
                    }
                    onStart()
                } else {
                    i.setImageResource(R.drawable.fill_heart)
                    listPos.isLiked = true

                    when (listPos.folder) {
                        0 -> {
                            Cache.array1List = list
                        }
                        1 -> {
                            Cache.array2List = list
                        }
                        2 -> {
                            Cache.array3List = list
                        }
                        3 -> {
                            Cache.array4List = list
                        }
                        4 -> {
                            Cache.array5List = list
                        }
                        5 -> {
                            Cache.array6List = list
                        }
                        6 -> {
                            var a = ArrayList<MyClass>()
                            var pos = -1
                            when (listPos.folder) {
                                0 -> {
                                    a = Cache.array1List
                                }
                                1 -> {
                                    a = Cache.array2List
                                }
                                2 -> {
                                    a = Cache.array3List
                                }
                                3 -> {
                                    a = Cache.array4List
                                }
                                4 -> {
                                    a = Cache.array5List
                                }
                                5 -> {
                                    a = Cache.array6List
                                }
                                6 -> {
                                    var a = ArrayList<MyClass>()
                                    var pos = -1
                                    when (listPos.folder) {
                                        0 -> {
                                            a = Cache.array1List
                                        }
                                        1 -> {
                                            a = Cache.array2List
                                        }
                                        2 -> {
                                            a = Cache.array3List
                                        }
                                        3 -> {
                                            a = Cache.array4List
                                        }
                                        4 -> {
                                            a = Cache.array5List
                                        }
                                        5 -> {
                                            a = Cache.array6List
                                        }
                                    }
                                    for (i in a.indices) {
                                        if (a[i].poemName == listPos.poemName && a[i].poem == listPos.poem && a[i].isLiked == listPos.isLiked && a[i].folder == listPos.folder) {
                                            pos = i
                                            a[i].isLiked = false
                                            when (listPos.folder) {
                                                0 -> {
                                                    Cache.array1List = a
                                                }
                                                1 -> {
                                                    Cache.array2List = a
                                                }
                                                2 -> {
                                                    Cache.array3List = a
                                                }
                                                3 -> {
                                                    Cache.array4List = a
                                                }
                                                4 -> {
                                                    Cache.array5List = a
                                                }
                                                5 -> {
                                                    Cache.array6List = a
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    onStart()
                }
            }
        }, list)

    }

    fun sendSMS(message: String) {
        try {
            val smsIntent = Intent(Intent.ACTION_VIEW)
            smsIntent.type = "vnd.android-dir/mms-sms"
            smsIntent.putExtra("sms_body", message)
            startActivity(smsIntent)
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(context, "No SIM found", Toast.LENGTH_SHORT).show()
        }
    }

    private fun copyCliboard(text: String) {
        val clipboardManager =
            context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboardManager.text = text
        Toast.makeText(context, "Nusxalab olindi", Toast.LENGTH_SHORT).show()
    }
}