package inheritance;

public
class Main {
    public static
    void main ( String[] args ) {

IndividualCustomer Erkan = new IndividualCustomer ();
Erkan.customerNumber = "15";


CustomerManager customerManager = new CustomerManager ();
customerManager.add ( Erkan );

/*CustomerManager,ekle metodunda anne sınıfı parametre aldığı için,çocuk sınıfları da ekle metoduna gönderebiliyorum.
Çocuk sınıflara ait müşterileri türünden anlıyor, Erkan müşterisi IndividualCustomer türünde bir nesne, bunu gönderebiliyorum */



//        Customer[] customers = {Erkan, yapıKredi};
//customerManager.addMultiple ( customers);
    }
}
