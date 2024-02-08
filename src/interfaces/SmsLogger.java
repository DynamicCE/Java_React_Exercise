package interfaces;

public
class SmsLogger implements Logger{
//Logger interface'i oluşturdum, SmsLogger'dan implement ettim, alt + enter tuşu ile implemented methods seçtim
    @Override
    public
    void log ( String message ) {
        System.out.println ("sSMS loglandı: "+ message );
    }
}
