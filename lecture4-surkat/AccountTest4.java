
import java.io.*;

class AccountTest4 {
  public static void main(String[] args) throws Exception {

    /* Oppretter et objekt av klassen Account. */
    final Account olesAccount = new Account(123456676756L, "Ole Olsen", 2300.50);
    /* Setter inn 1000 kroner */
    olesAccount.doTransaktion(1000.0); 
    /* Skriver ut nysaldoen */
    System.out.println(olesAccount);

    /* Lager et nytt objekt */
    Account karisAccount = new Account(123456576700L, "Kari G");
    karisAccount.doTransaktion(1500.0);
    System.out.println(karisAccount);
    
    //olesAccount = karisAccount
    System.out.println(olesAccount);

    String tekst = "Det er 9.august i dag. Om 2 uker er skolen i full gang.";
    int pos1  = tekst.indexOf('.');
    int pos2  = tekst.indexOf('9');
    int pos3  = tekst.indexOf('.', pos1 + 1);
    int pos4  = tekst.indexOf("Om");
    int pos5  = tekst.indexOf("Om", pos4 + 1);
    System.out.println(pos1);
    System.out.println(pos2);
    System.out.println(pos3);
    System.out.println(pos4);
    System.out.println(pos5);
  }
}
