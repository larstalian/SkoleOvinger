
import java.io.*;

import javax.swing.*;

class AccountTest2 {
  public static void main(String[] args) throws Exception {

    /* Oppretter et objekt av klassen Account. */
    Account olesAccount = new Account(123456676756L, "Ole Olsen", 2300.50);

    /* Setter inn 1000 kroner */
    olesAccount.doTransaktion(1000.0); 
   
    /* Spør objektet om den saldo */
    double saldo = olesAccount.getSaldo();
   
    /* Skriver ut nysaldoen */
    System.out.println("The new saldo is " + saldo);
    System.out.println(olesAccount);

    /* Lager et nytt objekt */
    Account myAccount = new Account(123456576756L, "Kim T");
    myAccount.doTransaktion(1500.0);
    System.out.println(myAccount);    
  }
}
