package com.lvntaslann.kotlinproject.funAndClass.kotlinoop

//default olarak final tanımlanır
//final olursa kalıtımla kullanılamaz
//open kullanılırsa kalıtım ile kullanılabilir
open class Kahraman(val isim:String, val ozelGuc:String) {

    fun kos(){
        println("Kahraman koştu")
    }
}