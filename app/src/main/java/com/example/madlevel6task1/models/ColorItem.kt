package com.example.madlevel6task1.models

data class ColorItem(var hex: String, var name: String) {

    fun getImageUrl() =
        "https://singlecolorimage.com/get/$hex/1080x1080"
}