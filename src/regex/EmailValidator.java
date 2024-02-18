package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class EmailValidator {
    String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; // bunu dışarıdan hazır alırız

    //Pattern nesnesi oluştur
    Pattern pattern = Pattern.compile (emailPattern); // Pattern.compile metoduna patternimizi gönderiyoruz, bunu da Pattern nesnesine atıyoruz


    //Matcher nesnesi oluştur ve eşleşme kontrolü yap
   public void match(String email){
     Matcher matcher = pattern.matcher ( email );
       if (email == null || !matcher.matches () ) {
           System.out.println ("geçersiz bir mail girdiniz" ); // mail geçersizse hata mesajı döndür
       }
   }


}
