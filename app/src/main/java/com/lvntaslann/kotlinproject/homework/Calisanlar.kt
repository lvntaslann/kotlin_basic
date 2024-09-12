package com.lvntaslann.kotlinproject.homework

import java.util.Objects

class Calisanlar(val isim:String,private var maas:Double,var departman:String,var yas:Int) {

    fun maasGoster(maas:Calisanlar):Double{
        return maas.maas;
    }
}