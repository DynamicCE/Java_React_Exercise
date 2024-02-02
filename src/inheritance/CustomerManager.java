package inheritance;

public
class CustomerManager {
    public
    void add ( Customer customer ) { // bu müşteri onu extend eden sınıfların referanslarını tutabilir.
        System.out.println ( customer.customerNumber + " kaydedildi" );
    }
// IndividualCustomer da CorporateCustomer da Customer'ı miras aldığı için,bunların getter setter'larını
// Customer için yazabilirim.Individual'a ya da Corporate'e özel getter setter yazmayız.Sistem bunu anlar.


    // bulk insert
    public
    void addMultiple ( Customer[] customers ) {

        for (Customer customer : customers) {
            add ( customer );
        }
    }
   /* bu kullanımı silip üstteki gibi yapabiliriz. Polymorphism. iki customer class'ı da Customer'ı extends ettiği için
    public void add(IndividualCustomer Customer){
        System.out.println (Customer.customerNumber+" kaydedildi" );
    }

    public void add(CorporateCustomer Customer){
        System.out.println (Customer.customerNumber+" kaydedildi" );
    }
    */
}
