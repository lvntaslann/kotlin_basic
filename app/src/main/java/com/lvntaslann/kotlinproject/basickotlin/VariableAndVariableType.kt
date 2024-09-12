package com.lvntaslann.kotlinproject.basickotlin

fun main(){
    //println("Levent Aslan");

    //kotlinde veri tipleri ve değiskenler
    //implicit tanımlama
    var x = 10;
    println(x*20)
    // val(sabit) x=10 yapılsaydı ilk tanımlanırken hata verecekti
    x=30;
    println(x*20)
    var y = 5
    val z=x+y;
    //z=herhangi bir sayi hataverir!
    println(z)

    //explicit tanımlama
    var ornek:Long =10

    //double - float
    //default olarak double gelir float yazmak için f kullanılması gerekir
    var pi = 3.14
    var ornekFloat : Float = 2.25f

    //String
    val benimString = "benim stringim"
    println(benimString)

    val ornekString:String ="Ornek"
    val isim = "levent"
    val soyIsim = "ASLAN"
    val tamAd = isim.uppercase() +  " "  +soyIsim.lowercase()
    println(tamAd)

    val benimStr : String
    benimStr = "Benim stringim" //initalize
    val yas = "15"
    println(yas.toInt())

    //boolean
    val benimBoolean: Boolean =true
    // > < == || && gibi operatörler kullanılabilir
    if(benimBoolean)
        println("Benim boolean true")
    else
        println("Benim boolean false")


}