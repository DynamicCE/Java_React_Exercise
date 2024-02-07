package inheritanceDemo;

public
class KrediUI {
    /*
        public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
            ogretmenKrediManager.Hesapla ();
        }
        public void KrediHesapla(TarımKrediManager tarımKrediManager){
            tarımKrediManager.Hesapla ();
        }
     */

    //KrediHesapla metoduna subClassları göndermektense superClass'ı gönderebiliriz ve kod tasarrufu yaparız
    // SuperClass, subClass'ların referansını tutabilir
    public
    void KrediHesapla ( BaseKrediManager baseKrediManager ) {
        baseKrediManager.Hesapla ( );
    }
}
