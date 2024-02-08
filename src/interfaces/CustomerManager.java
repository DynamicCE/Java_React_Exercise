package interfaces;

import javax.xml.crypto.Data;

public // loosly  tightly coupled
class CustomerManager { // CustomerManager loglamaya bağımlı. Bağımlılıkları gevşetmemiz lazım

    // Logger interface'ini kullanarak diğer sub Logger sınıflarını çağırabilmek için;
    // neye bağımlıysak private değişkenini yazıyoruz ( dependency injection tasarım deseni)
    // CustomerManager metotlarının erişebilmesi için Logger türünde ,logger isimli bir değişken tanımlıyoruz.
    private Logger logger;
    // right click -> generate -> constructor -> logger

    // CustomerManager constructoruna imza verildiği için, önceden imzasız çağrıldığı yerlerde parametreli imzayı tekrar çağırmamız gerekecek
    //Bu imza vermeyi de dependency injection design pattern için yapıyoruz, bu pattern için sadece "private Logger logger" tanımladık ve constructor oluşturduk
    public
    CustomerManager ( Logger logger ) { // Mainde çağırırken buraya istediğimiz Logger sınıfını newleyip çağırırız
        this.logger = logger;
    }

    public void add( Customer customer){
        System.out.println (customer.getFirstName () +" eklendi" );
//        DatabaseLogger databaseLogger = new DatabaseLogger ();
//        databaseLogger.log ( customer.getFirstName () );

        // dependency injectiondan sonra logger değişkenini nesne gibi çağırıp metodunu kullandırabiliriz;
        logger.log ( customer.getFirstName () );

    }
    public void delete(Customer customer){
        System.out.println (customer.getFirstName () +" silindi" );
//        DatabaseLogger databaseLogger = new DatabaseLogger ();
//        databaseLogger.log ( customer.getFirstName () );
        // bu şekilde yazabilirdik ama bu yazım tehlikeli, filelogger da yazılmak istendiği zaman kodu degistirmek gerekir, kötü kod

        // dependency injectiondan sonra:
        logger.log ( customer.getFirstName () );
    }
}
