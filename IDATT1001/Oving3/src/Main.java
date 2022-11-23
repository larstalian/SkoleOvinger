import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn ønsket tall for å se tallets gangetabell: ");
        while (true) {
            try {
                int tall = in.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(tall * i);
                }
            } catch (InputMismatchException e) {
                System.out.println("Ugyldig data");
                break;
            }

        }
    }
}