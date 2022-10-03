import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

class AccountTest {
    public static void main(String[] args) {

        /* Oppretter et objekt av klassen Account. */
        Account olesAccount = new Account(123456676756L, "Ole Olsen", 2300.50);

        /* Setter inn 1000 kroner */
        olesAccount.doTransaktion(1000.0);

        /* Spør objektet om dens saldo */
        double saldo = olesAccount.getSaldo();

        /* Skriver ut nysaldoen */
        System.out.println("The new saldo is " + saldo);
        System.out.println(olesAccount);
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn deposit. f for exit.");
        double input1 = in.nextDouble();

        while (input1 != 0) {
            olesAccount.doTransaktion(input1);
            double saldo2 = olesAccount.getSaldo();
            System.out.println(saldo2);
            input1 = in.nextDouble();
        }

    }
//        while (0 != input1) {
//            //int inputNumber = Integer.parseInt(inputString);
//            double input11 = Double.parseDouble(input1);
//            olesAccount.doTransaktion(input11);
//        }
}

