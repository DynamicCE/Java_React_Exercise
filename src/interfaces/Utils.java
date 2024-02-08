package interfaces;
// kendini tekrarlayan kodları bir metoda atayıp istediğimiz kadar çağırırız.
public
class Utils {
    public static
    void runLoggers (Logger[] loggers , String message) {
        for (Logger logger : loggers) {
            logger.log ( message );
        }
    }
}