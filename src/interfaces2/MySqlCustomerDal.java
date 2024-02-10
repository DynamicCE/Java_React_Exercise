package interfaces2;
// dal= data access layer
public
class MySqlCustomerDal implements ICustomerDal , IRepository {
    @Override
    public
    void add () {
        System.out.println ("My Sql'e eklendi" );
    }
}
