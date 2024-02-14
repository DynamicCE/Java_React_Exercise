package Game;

public
class CardGame extends Game {
    public
    CardGame () {

    }

    public
    CardGame ( String gameName, String releaseDate, double price ) {
        super ( gameName, releaseDate, price );
    }

    @Override
    public
    String getGameName () {
        return super.getGameName ( );
    }

    @Override
    public
    void setGameName ( String gameName ) {
        super.setGameName ( gameName );
    }

    @Override
    public
    String getReleaseDate () {
        return super.getReleaseDate ( );
    }

    @Override
    public
    void setReleaseDate ( String releaseDate ) {
        super.setReleaseDate ( releaseDate );
    }

    @Override
    public
    double getPrice () {
        return super.getPrice ( );
    }

    @Override
    public
    void setPrice ( double price ) {
        super.setPrice ( price );
    }
}
