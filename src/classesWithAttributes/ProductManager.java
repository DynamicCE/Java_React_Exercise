package classesWithAttributes;
// ProductManager ürünle alakalı yapılabilecek işlemler, ekle , sil, güncelle,listele. Adı üzerinde manage ediyor
public
class ProductManager {
    public void Add(Product product){
        // JDBC
        System.out.println ("product added "+product.get_name () );
    }
    public void Add2(int id,String name,String description,int stockAmount , double price){

    }


}
