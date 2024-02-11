package staticDemo;

public
class ProductManager {
    public
    void add ( Product product ) {
        // ProductValidator productValidator = new ProductValidator ( ); isValid'i static yapınca buraya gerek kalmadı
        //ProductValidator static olmuş olsa newlemeye gerek kalmadan kullanabilirdik ama bellekte yer kaplardı
        if (ProductValidator.isValid ( product )) {
            System.out.println ( product.name + " eklendi" );
        } else {
            System.out.println ( "eklenemedi " + product.name );
        }

    }
}
// Manager sınıfları asla static yapılmaz, yardımcı kullan-bırak araçlar static yapılabilir
// Bir metodu static yaptığımızda class ismiyle direkt çağırabiliriz