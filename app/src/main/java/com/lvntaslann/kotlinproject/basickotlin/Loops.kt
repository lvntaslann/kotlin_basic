package com.lvntaslann.kotlinproject.basickotlin
fun main(){
    var j = 0
    //while
    println("Döngü başladı")
    while(j<10){

        println(j)
        j++
    }
    println("Döngü bitti")

    //for döngüsü
    var baskaDizi = arrayListOf(5,10,15,20,25)
    println(baskaDizi[0]/5*3)
    println(baskaDizi[1]/5*3)

    println("Döngü başladı")
    for (numara in baskaDizi){
        println(numara/5*3)
    }
    println("Döngü bitti")


    //range
    for (num in 0..9){
        println(num*10)
    }

    val benimStringDizim = ArrayList<String>()
    benimStringDizim.add("Levent")
    benimStringDizim.add("Burak")

    println("For döngüsü ile")
    for (kelime in benimStringDizim){
        println(kelime.uppercase())
    }

    println("Foreach döngüsü ile")
    benimStringDizim.forEach {
        println(it.uppercase())
    }

}
