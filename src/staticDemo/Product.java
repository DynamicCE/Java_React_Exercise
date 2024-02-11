package staticDemo;

public
class Product {
    int id;
    String name;
    double price;

    public // yapıcı bloklar newleyince çalışır.Newlemeden çalıştırmak için yine static yapıcı blok yazarız
    Product ( int id, String name, double price ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
