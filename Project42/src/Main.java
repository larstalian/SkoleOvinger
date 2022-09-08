import java.util.*;

public class Main {
    private static Valuta Eur = new Valuta(11, "eur");
    private static Valuta Usd = new Valuta(10, "usd");
    private static Valuta Sek = new Valuta(0.93, "sek");
    private static List<Valuta> Valutas = Arrays.asList(Eur, Usd, Sek);


    public static void main(String[] args) {
        System.out.println("This program converts NOK to or from a limited selection of currencies");
        System.out.println("Convert \r\n 1. to NOK \r\n 2. from NOK");
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();
        boolean convertToNok;
        boolean toNok = switch (input1) {
            case 1 -> true;
            case 2 -> false;
            default -> throw new IllegalArgumentException("Bad Input, must be 1 or 2");
        };


        System.out.println("""
                Choose a currency: \r
                 1.USD \r
                 2. EUR \r
                 3. SEK""");
        String currencyType = in.next();

        Optional<Valuta> valuta = Valutas.stream().filter(v -> v.getId().equals(currencyType)).findFirst();
        if (valuta.isEmpty()) {
            throw new IllegalArgumentException(currencyType + " Bad input");
        }

        System.out.println("Enter moneyyy");
        double amount = in.nextDouble();
        double result;
        if (toNok) {
            result = valuta.get().ToNok(amount);
        } else {
            result = valuta.get().FromNok(amount);
        }
        System.out.println(result);


/*        Valuta valuta = switch (input3){
            case 1 -> Usd;
            case 2 -> Eur;
        };,
        if (toNok) {
            Currency1.currency1(input2, input3);
        } else {
            Currency1.currency2(input2, input3);
        }*/

    }
}