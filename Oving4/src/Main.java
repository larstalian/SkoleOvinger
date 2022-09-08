import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program converts NOK to or from a limited selection of currencies");
        System.out.println("Convert \r\n 1. to NOK \r\n 2. from NOK");
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();
        boolean convertToNok;
        boolean toNok;
        switch (input1) {
            case 1:
                toNok = true;

                break; klokka halv 6.
            case 2:
                //nothing to see here
                break;
            default:
                System.out.println("Bad input");
                System.exit(0);
        }


        System.out.println("""
                Choose a currency: \r
                 1.USD \r
                 2. EUR \r
                 3. SEK""");
        int input2 = in.nextInt();

        System.out.println("Enter moneyyy");
        double input3 = in.nextDouble();

        if (toNok) {
            Currency1.currency1(input2, input3);
        } else {
            Currency1.currency2(input2, input3);
        }

    }
}