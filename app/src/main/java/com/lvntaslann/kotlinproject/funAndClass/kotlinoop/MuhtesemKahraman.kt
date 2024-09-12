package com.lvntaslann.kotlinproject.funAndClass.kotlinoop

//kalıtım ile kullanılması için constructor fonksiyondaki istenen verilerinde girilmesi gerekir
class MuhtesemKahraman(isim: String, ozelGuc: String) :Kahraman(isim, ozelGuc) {
    //kalıtım alındığı için Kahraman sınıfındaki koş fonksiyonuna buradan da erişilebilir
    //constructorda oluşturulan değişkenler val ya da var tanımlanmamasına rağmen kalıtım alınan sınıfın özelliklerini taşır
}