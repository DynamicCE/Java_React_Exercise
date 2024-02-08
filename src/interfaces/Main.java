package interfaces;

public
class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager ( new EmailLogger ()  ); // dependency injectionla birlikte parametre alır, önceden parametresizdi
    Customer Erkan = new Customer ( 1,"Erkan","Murat" );
    customerManager.add ( Erkan );
    }
}
