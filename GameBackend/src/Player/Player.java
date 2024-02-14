package Player;

public
class Player {
    private int id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String age;
    boolean identityCondition = true;
    public Player(){

    }

    public
    Player ( int id, String firstName, String lastName, String nickName, String age ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.age = age;
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
    String getFirstName () {
        return firstName;
    }

    public
    void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public
    String getLastName () {
        return lastName;
    }

    public
    void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public
    String getNickName () {
        return nickName;
    }

    public
    void setNickName ( String nickName ) {
        this.nickName = nickName;
    }

    public
    String getAge () {
        return age;
    }

    public
    void setAge ( String age ) {
        this.age = age;
    }

    public
    boolean isIdentityCondition () {
        return identityCondition;
    }

    public
    void setIdentityCondition ( boolean identityCondition ) {
        this.identityCondition = identityCondition;
    }
}
