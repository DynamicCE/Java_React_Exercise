package interfaces;

public
class EmailLogger implements Logger{ // ampule filan tıklayıp implement methods deriz eğer bir classı implement ettiysek. Ya da generate'den


    @Override
    public
    void log ( String message ) {
        System.out.println ("e maile loglandı "+message );
    }
}
