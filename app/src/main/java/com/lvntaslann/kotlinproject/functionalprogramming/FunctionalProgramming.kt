package com.lvntaslann.kotlinproject.functionalprogramming

fun main(){
    //lambda
    var yazdigimiYazdirLambda = {verilenString: String-> println(verilenString) }
    yazdigimiYazdirLambda("Levent aslan")

    var carpmaIslemiLambda = {a:Int,b:Int->a*b}
    var sonuc = carpmaIslemiLambda(3,4)
    println(sonuc)

    //high order functions
    val benimListem = arrayListOf(1,3,4,5,9,11,13,15,17,19)

    //filter
    // val kucukSayilarListesi = benimListem.filter { it>6 } aynı işlemi görür
    val kucukSayilarListesi = benimListem.filter { num->num>6 }

    for (numara in kucukSayilarListesi){
        println(numara)
    }

    //Map
    val karesiAlinmisSayilar = benimListem.map { it*it }
    for (numara in karesiAlinmisSayilar){
        println(numara)
    }

    //map & filter
    val mapFilterBirArada = benimListem.filter { it<10 }.map { it *it }
    mapFilterBirArada.forEach { println(it) }

    val sanatcilar = arrayListOf<Sanatci>()
    val sanatci1 = Sanatci("Levent",21,"Klarnet")
    val sanatci2 = Sanatci("Melek",43,"Zurna")
    sanatcilar.add(sanatci1)
    sanatcilar.add(sanatci2)

    val otuzdanBuyukSanatcilar = sanatcilar.filter { it.yas>30 }.map { it.enstruman }
    otuzdanBuyukSanatcilar.forEach { println(it) }

    val otuzdanKucukOlanlarinIsmi = sanatcilar.filter { it.yas<30 }.map { it.isim }
    otuzdanKucukOlanlarinIsmi.forEach { println(it) }
}