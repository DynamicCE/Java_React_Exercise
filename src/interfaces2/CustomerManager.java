package interfaces2;
// amaç yine müşteri işlemleri yaparken veritabanı ile etkileşimde de bulunabilmek
public
class CustomerManager {
    // çocuklara değil anne sınıfa bağımlı olmalıyız bu  yüzden anne sınıfı(interface'i) tanımlıyoruz:
    ICustomerDal customerDal;

    public void add(){
        System.out.println ("müşteri şuraya eklendi " );

        customerDal.add ();
        // anne sınıfın add butonunu çağırdık, mainden bu anne sınıf yerine çocuk sınıfı attığımız zaman çocuk sınıfın add metodu çalışacak

    }
}
