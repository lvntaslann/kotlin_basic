package com.lvntaslann.kotlinproject.exception

fun main (){
    fun intOrNullFonksiyon(str:String):Int?{
        try {
            val numara =str.toInt()
            return numara
        }catch (e:Exception){
            e.printStackTrace()
        }
        return null;
    }

    val sonuc = intOrNullFonksiyon("levent")
    val islem = intOrNullFonksiyon("20")
    println(sonuc)
    println(islem)
}