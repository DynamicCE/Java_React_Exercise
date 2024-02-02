package inheritance;
// bir sınıf sadece ve sadece yapabildiklerini barındırmalı,alakasız kodları silmeli ya da taşımalıyız

public
class IndividualCustomer   extends Customer { // extends Customer yazınca , customer'daki ortak fieldları da bu classa atabiliyoruz

    String firstName;
    String lastName;
    String nationalIdentity;
}
