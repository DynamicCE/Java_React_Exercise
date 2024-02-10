package interfaces2;
// interfacelerin avantajı çoklu implementasyon
// interface'ler de abstract classlar gibi newlenemez
public
class Main {
    public static void main(String[] args){
        //Anne sınıf(interface) türünde bir değişken tanımlayıp bu değişkenle new çocukSınıf nesnesi yaratabiliyoruz (Polymorphism)
        CustomerManager customerManager = new CustomerManager ();

        customerManager.customerDal = new OracleCustomerDal ();//CustomerManagerda customerDal constructor oluşturup bu kullanımı yapmayabiliriz(tasarım deseni)

        customerManager.add ();

    }
}
