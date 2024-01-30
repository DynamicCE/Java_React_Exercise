package oopintro;

public
class Product {
    // ürünün adı , resmi , fiyatı vs ayrı veriler:
    String name;
    double unitPrice;
    String detail;
    int id;


// şimdi constructor yazalım ki direkt main methodda Product nesnesi oluştururken field'ları props olarak verebilelim
    public Product(String name,int id,double unitPrice, String detail) { // bu satır imza oluyor, bu imzaya göre nesne oluşturursak bu constructor çalışır
        this.name = name;
        this.id = id;
        this.unitPrice = unitPrice;
        this.detail = detail;

    }

    public Product(){ // Bu imzaya göre nesne oluşturursak bu constructor çalışır.
        System.out.println ("Boş nesne, fields girilmemiş.");
    }
}
// Product türünden nesneyi oluştururken olmasını istediğim kod varsa constructor bloğuna yazarım