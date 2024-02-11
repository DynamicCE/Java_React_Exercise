package staticDemo;

public
class Main {
    public static void main(String[]args){
        // maine newleyerek değil, main.main diyerek ulaşabiliriz başka yerlerden
        Product product1= new Product (3,"Apple", 30000.0);

        ProductManager productManager = new ProductManager ();
        productManager.add ( product1 );

DatabaseHelper.Crud.Delete (); // Static methodlar olduğu için newlemeden çağırabiliyorum
    }
}
