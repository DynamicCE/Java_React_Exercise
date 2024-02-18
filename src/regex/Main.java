package regex;

public
class Main {
    public static
    void main ( String[] args ) {
        String mail2 = "abcde@3159-09**";
        String mail3 = "anotherexample@3159gmail.com";
        EmailValidator emailValidator = new EmailValidator ();
        emailValidator.match ( mail2 );
        emailValidator.match ( mail3 ); // mail geçerli, hata mesajı döndürülmüyor
    }
}
