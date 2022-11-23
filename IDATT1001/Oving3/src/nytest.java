import java.util.InputMismatchException;
import java.util.Scanner;

public class nytest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dette programmet sjekker om tallet er et primtall. Skriv 0 for å avslutte programmet");
        System.out.println("Skriv inn tall:");
        boolean run = true;

        while (run) { //alt inn i en løkke for at catchen kan avbryte løkken
            boolean isPrime = true; //definerer bool
            int number;
            try { //prøver koden
                number = in.nextInt();
                if (number < 0) {
                    System.out.println("Tallet må være større enn 0. Prøv på nytt");
                    continue;
                }
                if (number == 69) {
                    System.out.println("nice");
                    continue;
                }

            } catch (InputMismatchException e) { //fanger feil
                System.out.println("Ugyldig Data");
                break; //avlsutter programmet når feil
            }
            for (int i = 2; i <= number / 2; i++) { //loop for å sjekke om tallet er primtall
                int remainder = number % i;
                if (remainder == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (number == 0) { // avslutter programmet når input er 0
                run = false;
            }
            if (isPrime) { // hvis isprime er true
                System.out.println("Tallet er et primtall");
            } else {
                System.out.println("Tallet er ikke et primtall");
            }
            System.out.println("Nytt tall:");
        }

    }

}
