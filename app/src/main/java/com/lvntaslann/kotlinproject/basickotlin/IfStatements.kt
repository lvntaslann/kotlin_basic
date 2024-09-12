package com.lvntaslann.kotlinproject.basickotlin

fun main (){
    println(3>5)
    var sayi = 10
    sayi = sayi+1
    println(sayi)
    sayi++
    println(sayi)
    println(10%3)

    val skor =31
    if(skor<10){
        println("Oyunu kaybettiniz")
    }else if(skor>=10 && skor<20){
        println("İdare eder")
    }else if(skor>=20 && skor<30){
        println("Güzel")
    }else{
        println("Çok güzel bir skor ettiniz")
    }

    //when
    val notRakam = 3
    var notString =""
    when(notRakam){
        0->notString="geçersiz"
        1->notString="Kötü"
        2->notString="idare eder"
        3->notString="iyi"
        4->notString="güzel"
        5->notString="Çok iyi"
        else->notString="Böyle bir not yok"
    }
    println(notString)
}