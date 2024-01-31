package nonOOP;

public
class Main {
    public static void main(String[] args){
        String Message = "Welcome to our world!";
        System.out.println (Message.substring ( 0,2 ) );
        System.out.println (Message.toLowerCase (  ) );
        System.out.println (Message.getBytes (  ) );
        System.out.println (Message.charAt ( 4 ) + " char at 4" );
        System.out.println (Message.endsWith ( "!" ) );
        System.out.println (Message.startsWith (  "A" ) );
        System.out.println (Message.contains ( "our" ) );
        System.out.println (Message.length () + " length ");
        System.out.println (Message.chars () +" chars");
    }
}
