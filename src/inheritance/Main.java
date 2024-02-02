package inheritance;

public
class Main {
    public static
    void main ( String[] args ) {
IndividualCustomer Erkan = new IndividualCustomer();
Erkan.customerNumber = "12345";

CorporateCustomer yapıKredi = new CorporateCustomer ();
yapıKredi.customerNumber ="78910";
IndividualCustomer Engin = new IndividualCustomer ();
Engin.customerNumber="13245";

CustomerManager customerManager = new CustomerManager ();
customerManager.add ( Engin );

        Customer[] customers = {Erkan, yapıKredi};
customerManager.addMultiple ( customers);
    }
}
