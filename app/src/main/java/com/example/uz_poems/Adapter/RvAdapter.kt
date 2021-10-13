package com.example.uz_poems.Adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.uz_poems.Cache.Cache
import com.example.uz_poems.Modles.MyClass
import com.example.uz_poems.R
import kotlinx.android.synthetic.main.bottom_menu.view.*
import kotlinx.android.synthetic.main.rv_item1.view.*

class RvAdapter(var myclicking:clicking, private var list:ArrayList<MyClass>):RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(var itemRv: View) : RecyclerView.ViewHolder(itemRv) {
        fun onBind(user: MyClass,position: Int) {
            itemRv.poemHead.text = user.poemName

            var satr = ""

            if (user.poem.length > 200){
                satr = user.poem.subSequence(0,200).toString()
            }else{
                satr = user.poem
            }

            itemRv.icon_like.setOnClickListener {
                myclicking.favorite(list[position],itemRv.icon_like)
            }

            itemRv.poem_body.text = satr
            if (user.isLiked){
                itemRv.icon_like.setImageResource(R.drawable.fill_heart)
            }else{
                itemRv.icon_like.visibility = View.INVISIBLE
            }
            itemRv.setOnClickListener {
                myclicking.click(position,user.poemName,user.poem,user.isLiked)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.rv_item1,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface clicking{
        fun click(position: Int,title:String,poem:String,isLike:Boolean)
        fun favorite(listPos:MyClass,i:ImageView)
    }
}