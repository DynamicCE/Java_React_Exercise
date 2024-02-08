package interfaces;
public
class Main {
    public static void main(String[] args){
        Logger[] loggers = {
                new SmsLogger (),
                new EmailLogger (),
                new FileLogger ()
        };
        CustomerManager customerManager = new CustomerManager ( loggers ); // dependency injectionla birlikte parametre alır, önceden parametresizdi
    Customer Erkan = new Customer ( 1,"Erkan","Murat" );
    customerManager.add ( Erkan );

    }
}
