package inheritance2;

public
class CustomerManager {
    public void add(Logger logger){ // Logger, diğer tüm loggerların referansını tutabiliyor. kimin referansını gönderirsek o çalışacak(miras alındığı için)
        // müşteri ekleme kodları
        System.out.println ("Müşteri eklendi" );
        logger.log ();
    }
}
