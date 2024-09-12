package com.lvntaslann.kotlinproject.funAndClass.kotlinoop

fun main(){
    //her şeyden önce init fonksiyonu çalışır
    var ogrenci = Sanatci("Levent",21,"Öğrenci")
    println(ogrenci.isim + " " +ogrenci.yas + " " + ogrenci.meslek)
    ogrenci.fonkCalistir()

    //encapsulation
    //tur private olarak tanımlandı ama getter fonksiyonunu yazdığımız için erişebiliyoruz
    //fakat üzerinde bir değişiklik yapılamaz
    ogrenci.turGetir()

    //inheritance
    var kahraman = Kahraman("Spiderman","ağ atmak")
    println(kahraman.isim + " " + kahraman.ozelGuc)
    kahraman.kos()
    var muhtesem = MuhtesemKahraman("Batman","Zengin olmak")
    println(muhtesem.isim + " " + muhtesem.ozelGuc)
    muhtesem.kos()

    //polymorphism
    var cikarma  = Islemler()
    var cikarma1 = cikarma.cikarma(10,20,30)
    var cikarma2 = cikarma.cikarma(10,20)
    var toplama  = Islemler()
    var toplama1 = toplama.toplama(10,20,30)
    var toplama2 = toplama.toplama(10,20)

    println(cikarma1)
    println(cikarma2)
    println(toplama1)
    println(toplama2)

    //abstraction
    //abstract class, interface
    // var insan = Insan() gibi bir kullanım olamaz soyut sınıfların objesi oluşturulmaz

}