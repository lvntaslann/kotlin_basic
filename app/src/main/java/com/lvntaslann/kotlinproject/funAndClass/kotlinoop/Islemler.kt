package com.lvntaslann.kotlinproject.funAndClass.kotlinoop

class Islemler {
    // aynı isimde birden fazla fonksiyon yazılabilir beklediği değişkenler farklı olmak şartıyla
    //buna polymorphism denir
    fun cikarma (x:Int,y:Int):Int{
        return x-y;
    }

    fun cikarma (x:Int,y:Int, z:Int):Int{
        return x-y-z;
    }

    fun toplama (x:Int,y:Int):Int{
        return x+y;
    }

    fun toplama (x:Int,y:Int, z:Int):Int{
        return x+y+z;
    }

    fun bolme(x: Int, y: Int): Int {
        if (y == 0) {
            println("Bölüm sıfır olamaz")
            return 0
        }
        return x / y
    }

    fun carpma(x: Int , y: Int):Int{
        return x*y;
    }

}