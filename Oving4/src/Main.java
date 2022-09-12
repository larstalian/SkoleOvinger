import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program converts NOK to or from a limited selection of currencies (to quit type 4 at any time");

        while (true) {
            System.out.println("Do you wish to convert: (type 1 or 2) \r\n 1. to NOK \r\n 2. from NOK ");
            Scanner in = new Scanner(System.in);

            Currency currencyUsd = new Currency(10.0);
            Currency currencyEur = new Currency(11.0);
            Currency currencySek = new Currency(0.93);

            int toNok;
            boolean toNokBool = false;
            toNok = in.nextInt();
            if (toNok == 1) {
                toNokBool = true;
            } else if (toNok == 2) {
            } else if (toNok == 4) {
                System.exit(0);
            } else {
                throw new IllegalStateException("Unexpected value: " + toNok);
            }
            System.out.println("Choose a currency: \n 1.USD \n 2.EUR \n 3.SEK");
            int currencyType = in.nextInt();
            if (currencyType == 4) System.exit(0);

            System.out.println("How much money do you wish to convert?");
            double exchangeInput = in.nextDouble();

            if (exchangeInput == 4) System.exit(0);

            switch (currencyType) {
                case 1:
                    if (toNokBool) {
                        System.out.println(currencyUsd.convertToNok(exchangeInput) + " NOK");
                    } else {
                        System.out.println(currencyUsd.convertFromNok(exchangeInput) + " USD");
                    }
                    break;
                case 2:
                    if (toNokBool) {
                        System.out.println(currencyEur.convertToNok(exchangeInput) + " NOK");
                    } else {
                        System.out.println(currencyEur.convertFromNok(exchangeInput) + " EUR");
                    }
                    break;
                case 3:
                    if (toNokBool) {
                        System.out.println(currencySek.convertToNok(exchangeInput) + " NOK");
                    } else {
                        System.out.println(currencySek.convertFromNok(exchangeInput) + " SEK");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + currencyType);
            }
            System.out.println("\n You can choose to convert again ( to quit type 4)");
        }
    }
}