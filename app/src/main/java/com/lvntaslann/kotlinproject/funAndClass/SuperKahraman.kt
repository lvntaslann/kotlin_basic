package com.lvntaslann.kotlinproject.funAndClass

class SuperKahraman {
    var isim =""
    var yas =0
    var meslek =""

    //constructor
    //constructor primary olarak sınıf içerisinde de oluşturulabilir
    /*constructor(){
        println("Superkahraman sınıfınından bir obje oluşturuldu")
    }*/

    constructor(isim:String,yas:Int,meslek:String){
        this.isim=isim;
        this.yas=yas;
        this.meslek=meslek;
    }



}
