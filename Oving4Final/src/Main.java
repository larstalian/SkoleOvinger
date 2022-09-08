import java.util.Scanner;

public class Main {


    private static void main(String[] args) {
        Valuta currency1 = new Valuta();
        Valuta currency2 = new Valuta();
        Valuta currency3 = new Valuta();


        System.out.println("This program");
        System.out.println("Do do wish to convert \n\r 1. To NOK \n\r 2. From NOK");
        Scanner in = new Scanner(System.in);
        int toOrFromNok = in.nextInt();
        boolean toNok = switch (toOrFromNok) {
            case 1 -> true;
            case 2 -> false;
            default -> throw new IllegalArgumentException("Bad Input");
        };
        System.out.println("Choose currency to convert to/from \n\r 1. EUR \n\r 2. USD \n\r 3. SEK");
        int currencyType = in.nextInt();
        switch (currencyType)

        }


    }

}