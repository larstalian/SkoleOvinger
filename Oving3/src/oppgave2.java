import java.util.*;

public class oppgave2 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int tall;
            System.out.println("Skriv inn et tall for å sjekke om det er primtall(0 for å avslutte)");
            try {
                tall = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ugyldig Data");
                continue;
            }
            if (KanSjekkeOmPrimtall(tall)) {
                System.out.println(ErPrimTall(tall));
            } else {
                System.out.println("Ugyldig input");
            }
            if (tall == 0) {
                break;
            }
        }
    }

    private static boolean ErPrimTall(int tall) {
        boolean erPrimtall = true;
        for (int i = 2; i <= tall / 2; i++) {
             int rest = tall % i;
            if (rest == 0) {
                erPrimtall = false;
                break;
            }
        }
        return erPrimtall;
    }

    private static boolean KanSjekkeOmPrimtall(int tall) {
        return tall > 1;
    }
}
