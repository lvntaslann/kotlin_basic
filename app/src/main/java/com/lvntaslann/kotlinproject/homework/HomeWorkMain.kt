package com.lvntaslann.kotlinproject.homework

fun main(){
    var calisan1 = Calisanlar("Levent",1031.0,"yazilim",21)
    var calisan2 = Calisanlar("Burak",1032.0,"yazilim",22)
    var calisan3 = Calisanlar("Emre",1033.0,"yazilim",23)
    var calisan4 = Calisanlar("Emirhan",1034.0,"yazilim",22)
    var calisan5 = Calisanlar("Burcin",1000.0,"donanim",22)
    var calisan6 = Calisanlar("Zeynep",1000.0,"tester",22)
    var calisan7 = Calisanlar("Reyhan",1000.0,"frontend",22)
    var calisan8 = Calisanlar("Sevde",1000.0,"backend",21)
    var calisan9 = Calisanlar("Eda",1000.0,"designer",23)
    var calisan10 = Calisanlar("Selin",1000.0,"donanim",21)
    var calisanlarListesi = arrayListOf<Calisanlar>(calisan1,calisan2,calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)

    println("ilk soru")
   var list= calisanlarListesi.filter { it.yas>22 }.filter { it.departman=="yazilim" }.map { it.maasGoster(it) }
    for (index in list){
        println(index)
    }
    println("ikinci soru")
    var list2 =calisanlarListesi.filter { it.yas>22 }.map { it.isim }
    for (index in list2){
        println(index)
    }

}