package abstractClasses;

public
class Main {
  public static void main(String[] args){
      WomanGameCalculator womanGameCalculator = new WomanGameCalculator ();

GameCalculator gameCalculator = new WomanGameCalculator ();
// Miras alınanın türünde , çocuğun nesnesini oluşturabiliyoruz (Polymorphism)

      gameCalculator.hesapla ();


  }
}
