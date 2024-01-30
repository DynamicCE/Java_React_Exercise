package kodlamaio;

public
class KodlamaioCourse {
    String name;
    String description;
    String author;
    int price ;
    // constructor ismi ile class'ın ismi aynı olmalı
    public KodlamaioCourse(String name,String description,String author,int price){
        this.name = name;
        this.description = description;
        this.author=author;
        this.price=price;

    }
}
