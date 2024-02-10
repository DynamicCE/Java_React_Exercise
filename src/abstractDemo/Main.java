package abstractDemo;

public
class Main {
    public static void main(String[]args){
        // müşterinin farklı veritabanlarına kaydedilmesi uygulaması

        CustomerManager customerManager = new CustomerManager ();
        customerManager.databaseManager = new SqlServerDatabaseManager ();
        customerManager.getCustomers ();
    }
}
