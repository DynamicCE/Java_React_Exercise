package oopintro;

public
class Main {

    public static
    void main ( String[] args ) {

        /*
         * String[] products = { "Lenovo V14", "Lenovo V15", "Hp 5" }; bu yaklaşım
         * gerçekçi değil, objeler sadece isimleriyle var olmazlar.
         */

        // benim üç tane verim var(bilgisayar) , o verilerin türü Product
        // Product[] products = getProducts(); gerçek hayat kullanımı bu tarz, veritabanından dataları getirecek method

// Javada classlar referans tiptir.
        Product product1 = new Product ( ); // referans oluşturma , instance
        product1.setId ( 1 );
        product1.setName ( "Lenovo v14" );
        product1.setUnitPrice ( 14000 );
        product1.setDetail ( "16 gb ram" );
        product1.setDiscount ( 10 );

        System.out.println (product1.getUnitPriceAfterDiscount ( ) );

Category category = new Category (13,"Kırtasiye"  );
        Category category2 = new Category (14,"Ofis"  );

        System.out.println (category.getName () );
        System.out.println (category2.getName () );
//nesne oluştururken fazla kod yazmamak için, constructor ile field'ları atayabiliyorum.
    }

}
