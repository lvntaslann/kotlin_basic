package com.lvntaslann.kotlinproject.basickotlin

fun main(){
    val benimDizim = arrayOf("levent","aslan","bilecik seyh edebali","edirne")
    println(benimDizim[1])
    println(benimDizim.last())
    benimDizim[1] = "ASLAN"
    println(benimDizim[1])
    println(benimDizim.get(3))

    //arrayList

    val isimListesi = arrayListOf("levent","gorkem","burak","emre")
    println(isimListesi.size)
    isimListesi.add("mahmut")
    println(isimListesi.get(4))
    isimListesi.removeAt(1)
    println(isimListesi[1])

    val numaraListesi = arrayListOf<Int>()
    val digerOrnekListe = ArrayList<Int>(4)
    numaraListesi.add(10)
    numaraListesi.add(20)
    numaraListesi.add(30)
    digerOrnekListe.add(40)
    digerOrnekListe.add(50)
    digerOrnekListe.add(60)
    println(numaraListesi[0]*digerOrnekListe[0])

    val karisikBosListe = ArrayList<Any>()
    karisikBosListe.add("levent")
    karisikBosListe.add(20)
    println(karisikBosListe[0])
    println(karisikBosListe[1])

    //set
    var dizi = arrayOf(10,10,10,10,10)
    println(dizi[1])
    println(dizi[2])

    val ornekSet = setOf(10,10,10,10,20,30)
    // tek bir 10 alarak elemanları 10 20 30 olarak görecek
    //setlerde index mantığı yoktur unorderedtır yani
    println(ornekSet.size)
    ornekSet.forEach { println(it) }

    //map anahtar - değer eşleşmesi
    //her bir keyden bir adet olabilir
    val yemekKaloriMapi = hashMapOf<String,Int>()
    yemekKaloriMapi.put("Elma",100)
    yemekKaloriMapi.put("Armut",200)
    yemekKaloriMapi.put("karpuz",300)
    yemekKaloriMapi.put("Elma",300)
    println(yemekKaloriMapi["Elma"])
}