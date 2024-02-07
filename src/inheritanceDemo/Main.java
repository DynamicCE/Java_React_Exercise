package inheritanceDemo;
// değişim geldiğinde programımız direniyorsa temiz kod yazmıyoruz demektir.
public
class Main {
    public static void main(String [] args){
KrediUI krediUI = new KrediUI ();
krediUI.KrediHesapla ( new OgretmenKrediManager () ); // OgretmenKrediManager türünde bir nesne tanımlayabiliriz, OgretmenKrediManager içindeki kod çalışır

        krediUI.KrediHesapla ( new TarimKrediManager () ); // BaseKrediManager'ı extend eden tüm KrediManager türlerini çağırabiliriz, içlerindeki kodlar çalışır
    }
}
