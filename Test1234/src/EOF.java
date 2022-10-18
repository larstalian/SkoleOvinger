import java.util.Scanner;

/**
 * Klasse for å demonstrere End-Of-Life. Loopen fortsetter helt til Scanneren ikke inneholder en String.
 */
public class EOF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; in.hasNext(); i++) {
            String s = in.nextLine();
            System.out.println(i + " " + s);
        }
    }
}
