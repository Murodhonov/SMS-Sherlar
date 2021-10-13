package com.example.uz_poems.Modles

class MyClass {
    var poemName = ""
    var poem = ""
    var isLiked = false
    var folder = 0

    constructor()
    constructor(isLiked: Boolean, folder: Int,poemName: String, poem: String) {
        this.poemName = poemName
        this.poem = poem
        this.isLiked = isLiked
        this.folder = folder
    }
}