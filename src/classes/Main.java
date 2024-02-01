package classes;

//Classlar referans tiptir
//Diziler referans tiptir
public
class Main {
    public static
    void main ( String[] args ) {
        CustomerManager customerManager = new CustomerManager ( ); // önce classı burada oluşturmam lazım.
        // newlediğim zaman Heap'te customerManager referansı oluşur.Yani heap'teki customerManager için , heap'te bir referans oluşur.
        // new pahalıdır,sadece ihtiyaç duyulduğu zaman newle
// değer tipte değişken oluşturduğum zaman her şey stack'te olup biter, heap ile işi olmaz.
        customerManager.Add ( );
        customerManager.Delete ( );
        customerManager.Update ( );
    }
}



