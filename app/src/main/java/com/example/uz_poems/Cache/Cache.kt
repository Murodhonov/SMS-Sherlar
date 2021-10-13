package com.example.uz_poems.Cache

import android.content.Context
import android.content.SharedPreferences
import com.example.uz_poems.Modles.MyClass
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Cache {
    private const val NAME = "forCache"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operations: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operations(editor)
        editor.apply()
    }

    var favoriteList: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("liked", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("liked", Gson().toJson(value))
        }

    var array1List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array11", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array11", Gson().toJson(value))
        }

    var array2List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array12", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array12", Gson().toJson(value))
        }

    var array3List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array13", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array13", Gson().toJson(value))
        }

    var array4List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array14", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array14", Gson().toJson(value))
        }

    var array5List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array15", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array15", Gson().toJson(value))
        }

    var array6List: ArrayList<MyClass>
        get() = Gson().fromJson(preferences.getString("array16", "[]")!!,
            object : TypeToken<ArrayList<MyClass>>() {}.type)
        set(value) = preferences.edit {
            it.putString("array16", Gson().toJson(value))
        }
}