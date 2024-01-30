package oopintro;

public
class Main {

    public static
    void main ( String[] args ) {

        /*
         * String[] products = { "Lenovo V14", "Lenovo V15", "Hp 5" }; bu yaklaşım
         * gerçekçi değil, objeler sadece isimleriyle var olmazlar.
         */

        // benim üç tane verim var(bilgisayar) , o verilerin türü product
        // Product[] products = getProducts(); gerçek hayat kullanımı bu tarz, veritabanından dataları getirecek method

// Javada classlar referans tiptir.
        Product product1 = new Product ( ); // referans oluşturma , instance
        product1.id = 1;
        product1.unitPrice = 14000;
        product1.name = "Lenovo v14";
        product1.detail = "16 gb ram";

        Product product2 = new Product ( ); // newlediğim anda Product nesnesinin fieldlarına sahip yeni bi referans oluşur.(girilene kadar null fieldlar)
        product2.id = 2;
        product2.unitPrice = 18000;
        product2.name = "Lenovo v15";
        product2.detail = "32 gb ram";

        Product product3 = new Product ( );
        product3.id = 3;
        product3.unitPrice = 10000;
        product3.name = "Hp 5";
        product3.detail = "8 gb ram";


        Product[] products = {product1, product2, product3}; // nesne dizisi, yukarıda tanımladığım nesneleri içine attım
        for (Product product : products) { //bir üst satırdaki products'ın elemanlarını for'a tanımlıyorum.
            System.out.println ( product.name );// her eleman için product fieldları döndürülüyor
            System.out.println ( product.detail );
            System.out.println ( product.unitPrice );

        }


        System.out.println ( products.length );
        System.out.println ( product1.name );

        Category category1 = new Category (); //Category türünde nesne oluşturdum, bu nesnenin fieldları Category classında tanımlanmıştı,burada ise fieldları belirledik
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2 = new Category ();
        category2.id=2;
        category2.name="Ev-Bahçe";

    }

}
