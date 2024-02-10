package abstractDemo;

public
class CustomerManager {
    // müşteri eklendiği zaman veritabanından veri de gelsin istiyoruz, bunun için miras alınan sınıfı tanımladık (BaseDatabaseManager)
    // anne sınıfı değişken gibi tanımlayarak metodunu çağırdık (BaseDatabaseManager)
    // Main sınıfında kullanırken anne sınıfın değişkenine istediğimiz çocuk sınıfı atayıp çocuğun metodunu kullanabiliyoruz
    // anne sınıfa değişken atama işlemini de "customerManager.anneSınıf = new cocukSinif();" yazarak yaparız

    BaseDatabaseManager databaseManager; // bağımlı olduğumuz strateji

    public
    void getCustomers () {
        System.out.println ( "müşteriler eklendi,getirildi " );
        databaseManager.getData ( );
    }
}
//Solid'in ikinci harfi 0: "open close principle": 'yeni özellik geleceği zaman hazırdaki kodlar değişmemeli'
//Biz yeni bir databaseManager sınıfı ekleyerek yeni özellik getirebiliyoruz