import java.util.InputMismatchException;
import java.util.Scanner;

public class oppgave1v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dette tallet viser gangetabellen mellom 2 valgte tall");
        System.out.println("Velg første tall:");
        int numberInput1 = 0;
        int numberInput2 = 0;

        try {
            numberInput1 = in.nextInt(); //første tall
            System.out.println("Velg andre tall:");
            numberInput2 = in.nextInt(); //andre tall

        } catch (InputMismatchException e) {
            System.out.println("Ugyldig data");
            System.exit(0); //avslutter programmet
        }

        for (int j = numberInput1; j <= numberInput2; j++) { //loop for hele gangetabllen
            System.out.println("\r\n" + j + " gangen:");
            for (int i = 1; i <= 10; i++) { //loop for å vise hver enkelt gangetabell
                System.out.println(j + " X " + i + " = " + i * j);
            }
        }
    }
}