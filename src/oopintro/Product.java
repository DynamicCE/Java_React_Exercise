package oopintro;

public
class Product {
    // ürünün adı , resmi , fiyatı vs ayrı veriler:

    // encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;

    public
    Product () {

    }

    // sağ tık yapıp generate-> constructor dediğim zaman bu yapıcı metodu tıklanan yerde hızlıca oluşturuyor
    public
    Product ( int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount ) {
        this.setId ( id );
        this.setName ( name );
        this.setUnitPrice ( unitPrice );
        this.setDetail ( detail );
        this.setDiscount ( discount );

    }

    public
    int getId () {
        return id;
    }

    public
    void setId ( int id ) {
        this.id = id;
    }

    public
    String getName () {
        return name;
    }

    public
    void setName ( String name ) {
        this.name = name;
    }

    public
    double getUnitPrice () {
        return unitPrice;
    }

    public
    void setUnitPrice ( double unitPrice ) {
        this.unitPrice = unitPrice;
    }

    public
    String getDetail () {
        return detail;
    }

    public
    void setDetail ( String detail ) {
        this.detail = detail;
    }

    public
    double getDiscount () {
        return discount;
    }

    public
    void setDiscount ( double discount ) {
        this.discount = discount;
    }

    public
    double getUnitPriceAfterDiscount () {
        return unitPrice - unitPrice * discount / 100;
    }
}
// Product türünden nesneyi oluştururken olmasını istediğim kod varsa constructor bloğuna yazarım