package abstractClasses;

public abstract
class GameCalculator {
    // çocuklar,kadınlar,erkekler için hesaplama olacak.
    // içeriği değişse de hesaplama hep olacak, böyle durumlarda hemen bir base düşünmeliyiz, iflere girmemeliyiz
    // birbirinin alternatifi olan işler için iflere girme!

    //abstract kullanımı, GameCalculator'u abstract işaretledik ve hesapla metodunun işlem bloğunu sildik, ona da abstract yazdık
    public abstract
    void hesapla (); // hesapla'nın işlem bloğu yok, override edilmek zorunda

    public final
    void gameOver () { // override edilmesini istemiyorsak final'keywordü kullanırız(tamamlanmış operasyon)
        System.out.println ( "Oyun bitti" );
    }
}
// Metodu alt sınıflara zorunlu olarak override edip uygulatmak abstract sınıf kullanılır
// Abstract kullanmak için sınıf ve operasyon abstract keywordu almalı
// abstract sınıflarda istediğimiz kadar tamamlanmış ve abstract operasyon kullanabiliriz
// base'i gizlemek istediğimiz zamanda da kullanırız, abstract sınıflar asla newlenemez
// normal bi sınıfla yapısal anlamda farkı yoktur