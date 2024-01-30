package oopintro;
// DONT REPEAT YOURSELF, USE METHODS

// iş yapan sınıf
public class ProductManager {
    public void addToCart(Product product){
        System.out.println ("Sepete ekleme kodu çağırıldı, " + product.name +" sepete eklendi.");
    }
}
