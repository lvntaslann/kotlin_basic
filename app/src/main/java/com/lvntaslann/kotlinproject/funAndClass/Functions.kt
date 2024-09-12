package com.lvntaslann.kotlinproject.funAndClass

fun main(){

    fun firstFun(){
        println("first fun")
    }

    fun secondFun(){
        println("second fun")
    }

    var sayac =0
    fun sayacArttır(){
        sayac++
        println("Sayac: ${sayac}")
    }
    sayacArttır()
    sayacArttır()

    //girdi almak
    //return değeri olanlar bir değişkene aktarılıp değer döndürebilir
    //fakat bir return değeri olamayan fonksiyon Unittir değişkene atanamaz
    //yazdırılırsa kotlin.unit gibi bir çıktı alınır
    fun cikarma(a:Int,b:Int){
        println("Çıkarma sonucu : ${a-b}")
    }

    // var sonuc = cikarma(10,5) output:kotlin.unit
    cikarma(10,5)

    // var sonuc = toplama(10,20) output:30
    fun toplama(a:Int,b:Int):Int{
        return a+b;
    }
    toplama(10,20)

    //constructor çalışmasının testi
    var obje = SuperKahraman("Superman",30,"Gazeteci")
    println(obje.isim)
    println(obje.yas)
    println(obje.meslek)

    //nullabilitiy
    val kullaniciGirdisi ="20"
    val kullaniciGirdisiInteger = kullaniciGirdisi.toIntOrNull()
    //uygulama çökmesini engellemek için
    if(kullaniciGirdisiInteger!=null){
        println(kullaniciGirdisiInteger*2)
    }

    val benimDouble : Double? = null
    val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()
    //!!
    // kullaniciGirdisiDouble!!.div(2) ünlem kıullanmak %100 null gelmeyeceğini belirtiyoruz
    //tek bir soru işareti null gelsede uygulamanın çökmemesi için
}