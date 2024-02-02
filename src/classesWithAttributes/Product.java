package classesWithAttributes;
// Productla, ürünle alakalı özellikler, adı ,sanı, stoğu, rengi , ağırlık vs
// field = attribute

public
class Product {
    // Product türünden nesneyi oluştururken olmasını istediğim kod varsa constructor bloğuna yazarım
    public
    Product ( int id, String name, String description, double price, int stockAmount ) {
        System.out.println ( "yapıcı blok çalıştı" );
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
    }

    public
    Product () {
        // Aşırı yükleme, isteyen bu şekilde de kullanabilir. İlla çağırır çağırmaz tüm değerleri girmek zorunda değil.
    }

    // ürüne ait bilgiler, değişkenler(fields)
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;
// alt çizgili değişkenler field oluyor.

    public
    int getId () { //id'yi değiştirebiliriz de
        return get_id ( );
    }

    public
    void setId ( int id ) {
        set_id ( id ); // idler karışıyor diye this kullanabilirdik,
        // bu this kullanımları ile uğraşmamak için constructor method öncesi belirlediğimiz değişkenlere alt çizgi getiririz
    }

    public
    int get_id () {
        return _id;
    }

    public
    void set_id ( int _id ) {
        this._id = _id;
    }

    public
    String get_name () {
        return _name;
    }

    public
    void set_name ( String _name ) {
        this._name = _name;
    }

    public
    String get_description () {
        return _description;
    }

    public
    void set_description ( String _description ) {
        this._description = _description;
    }

    public
    double get_price () {
        return _price;
    }

    public
    void set_price ( double _price ) {
        this._price = _price;
    }

    public
    int get_stockAmount () {
        return _stockAmount;
    }

    public
    void set_stockAmount ( int _stockAmount ) {
        this._stockAmount = _stockAmount;
    }

    public
    String get_color () {
        return _color;
    }

    public
    void set_color ( String _color ) {
        this._color = _color;
    }

    public
    String get_code () {
        return _code.substring ( 0, 1 ) + _id;
    }


}
