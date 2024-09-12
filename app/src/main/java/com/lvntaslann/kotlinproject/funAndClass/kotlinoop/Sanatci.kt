package com.lvntaslann.kotlinproject.funAndClass.kotlinoop

class Sanatci (var isim:String,var yas:Int, var meslek:String):Insan(),Sarki,Dans {
    private var tur = "insan";

    //her bir sınıf sadece bir sınıftan extends alabilir
    //interfaceler abstract yapıda olduğu için bir sınıfta birden fazla interface implement edilebilir

    fun turGetir(){
        println(this.tur);
    }

    fun fonkCalistir(){
        println("fonksiyon çalıştırıldı")
    }

    init {
        println("init çağırıldı")
    }

    //abstract sınftan üretilen abstrack fonksiyonlar implement alan sınıfta ovveride edilmeli
    override fun test() {
        //abstract sınftan gelen abstract fonskiyonun ovveride edilmiş hali
    }

     override fun dansEtmeFonksiyonu(){

    }

    override fun sarkiSoylemeFonksiyonu() {

    }



}