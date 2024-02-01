package classesWithAttributes;

public
class Main {
    public static
    void main ( String[] args ) {
        /*
        Product product = new Product ( );
        product.set_id ( 1 );
        product.set_id(1);
        product.set_description("laptop 8gb");
        product.set_price(14000);
        product.set_stockAmount(3);
        */
        // yukarıdaki ayarlamaları direkt constructor bloğundan da set edebiliriz. New product oluştururken çalışacak kodlar olur
        Product product = new Product ( 15, "laptop lenovo", "laptop", 15000.0, 3 );
        // isteyen constructor ile değer versin, isteyen yukarıdaki gibi değişkenleri atasın diye boş constructor da kullanabiliriz




        System.out.println ( product.get_name ( ) );


        ProductManager productManager = new ProductManager ( );
        productManager.Add ( product );

    }
}
