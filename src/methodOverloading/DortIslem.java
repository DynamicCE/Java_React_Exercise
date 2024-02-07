package methodOverloading;

public
class DortIslem {
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    // aynı metodu aynı isimle ama farklı değişkenlerle(farklı imzayla) yazmak , farklı kod döndürmek method overloading
    public int topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2;
    }
}
