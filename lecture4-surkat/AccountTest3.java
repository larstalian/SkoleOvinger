
import java.io.*;

class AccountTest3 {

  // static variables are also called class variables. That is, they belong to a class and not a particular instance
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {

    Account myAccount = new Account(123456576756L, "Kim T");

    System.out.print("Type 'e' for å Sett inn penger, 'w' for å ta ut penger, 's' for å vis saldo, eller 'f' for Exit: ");
    char operationType = br.readLine().charAt(0);

    while(operationType != 'f') {

      switch (operationType) {
        case 'e' -> {
          System.out.print("Please enter amount to deposit: ");
          int inputAmount = Integer.parseInt(br.readLine());
          myAccount.doTransaktion(inputAmount);
          System.out.println("Your new balance is: " + myAccount.getSaldo());
        }
        case 'w' -> {
          System.out.print("Please enter amount to withdraw: ");
          int withdrawAmount = Integer.parseInt(br.readLine());
          myAccount.doTransaktion(-withdrawAmount);
          System.out.println("Your new balance is: " + myAccount.getSaldo());
        }
        case 's' -> System.out.println("Your balance is: " + myAccount.getSaldo());
      }

      System.out.print("Type 'e' for å Sett inn penger, 'w' for å ta ut penger, 's' for å vis saldo, eller 'f' for Exit: ");
      operationType = br.readLine().charAt(0);
    }
  }

}
