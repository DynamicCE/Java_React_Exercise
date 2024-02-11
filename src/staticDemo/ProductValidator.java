package staticDemo;

public
class ProductValidator {


    public static boolean isValid(Product product){
if(product.price>0 && !product.name.isEmpty () ){
    return true;
}else {
    return  false;
}
    }


    public void  birSey(){
        // bu metot static olmadığı için, bu metodu çağırabilmek için ProductValidator'u newlememiz gerekiyor
    }
}
// bir ürünü kaydederken, güncellerken kurallara uygun olup olmadığını bulmak için bu sınıfı kullanırız

