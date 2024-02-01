package oopbasic;

public
class Numbers {
    public static
    int plus ( int number1, int number2 ) {
        return number1 + number2;
    }

    public static
    int minus ( int number1, int number2 ) {
        return number1 - number2;
    }

    public static
    int multiply ( int number1, int number2 ) {
        return number1 * number2;
    }

    public static
    int divide ( int number1, int number2 ) {
        return number1 / number2;
    }

    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    // methodlara istenilen miktarda sayı göndermek için destructring kullanılır, adı javascriptte buydu;

    public static
    int plus2 ( int... numbers ) { // numbers bir sayı dizisi oldu
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static
    int minus2 ( int... numbers ) { // numbers bir sayı dizisi oldu
        int result = numbers[0];
        for (int i = 1; i<numbers.length ; i++) {
            result -= numbers[i];
        }
        return result;
    }

/*    public static
    int multiply2 ( int... numbers ) {
return  ;
    }*/

    public static
    int divide2 ( int... numbers ) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }




}
