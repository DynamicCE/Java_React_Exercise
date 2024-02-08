package interfaces;


public // loosly  tightly coupled
class CustomerManager { // CustomerManager loglamaya bağımlı. Bağımlılıkları gevşetmemiz lazım

    // Logger interface'ini kullanarak diğer sub Logger sınıflarını çağırabilmek için;
    // neye bağımlıysak private değişkenini yazıyoruz ( dependency injection tasarım deseni)
    // CustomerManager metotlarının erişebilmesi için Logger türünde ,logger isimli bir değişken tanımlıyoruz.
    private Logger[] loggers;
    // right click -> generate -> constructor -> logger
    // logger daha sonra loggers oldu, çoklu loglama sistemi getirdik

    // CustomerManager constructoruna imza verildiği için, önceden imzasız çağrıldığı yerlerde parametreli imzayı tekrar çağırmamız gerekecek
    //Bu imza vermeyi de dependency injection design pattern için yapıyoruz, bu pattern için sadece "private Logger[] loggers" tanımladık ve constructor oluşturduk
    public
    CustomerManager ( Logger[] loggers ) { // Mainde çağırırken buraya istediğimiz Logger sınıfını newleyip çağırırız
        // Logger loggers parametresi aldığı için ve diğer sub loggers sınıflarının her biri bir Logger loggers olduğu için buraya sub loggers girebilriz
        this.loggers = loggers;
    }

    public
    void add ( Customer customer ) {
        System.out.println ( customer.getFirstName ( ) + " eklendi" );
//        DatabaseLogger databaseLogger = new DatabaseLogger ();
//        databaseLogger.log ( customer.getFirstName () );

        // dependency injectiondan sonra logger değişkenini nesne gibi çağırıp metodunu kullandırabiliriz;
//        for (Logger logger: loggers){
//            logger.log ( customer.getFirstName () );
//        }

        // static olmadan, Utils'i newlememiz gerekirdi
//        Utils utils = new Utils ( );
//        utils.runLoggers ( loggers, customer.getFirstName ( ) );

        //Static olduğu zaman newlemeye gerek kalmaz;
        Utils.runLoggers ( loggers, customer.getFirstName ( ) );
    }

    public
    void delete ( Customer customer ) {
        System.out.println ( customer.getFirstName ( ) + " silindi" );
//        DatabaseLogger databaseLogger = new DatabaseLogger ();
//        databaseLogger.log ( customer.getFirstName () );
        // bu şekilde yazabilirdik ama bu yazım tehlikeli, filelogger da yazılmak istendiği zaman kodu degistirmek gerekir, kötü kod. Bu yüzden dependency injection

        // dependency injectiondan sonra:
//        for (Logger logger: loggers){
//            logger.log ( customer.getFirstName () );
//        } bu foreach'i tüm metotlarda ayrı ayrı yazmak sıkıntılı, bu yüzden Utils yazdık

        Utils.runLoggers ( loggers, customer.getFirstName ( ) );
    }
}
// Dependency injection tasarım desenini kullanmak için;
/* interface'i implement eden sınıfları ayrı ayrı çağırmak yerine direkt Logger interface'i türünden bir değişken oluşturup metodunu kullandık
 *   bu sayede interface'i implement eden tüm sınıfları interface'in parametre olarak gönderildiği metoda gönderebiliyoruz.
 * */