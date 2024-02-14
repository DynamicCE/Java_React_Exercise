package Game;

public
class Game {
    String gameName;
    String releaseDate;
    double price;

    public Game(){

    }

    public
    Game ( String gameName, String releaseDate, double price ) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public
    String getGameName () {
        return gameName;
    }

    public
    void setGameName ( String gameName ) {
        this.gameName = gameName;
    }

    public
    String getReleaseDate () {
        return releaseDate;
    }

    public
    void setReleaseDate ( String releaseDate ) {
        this.releaseDate = releaseDate;
    }

    public
    double getPrice () {
        return price;
    }

    public
    void setPrice ( double price ) {
        this.price = price;
    }
}

