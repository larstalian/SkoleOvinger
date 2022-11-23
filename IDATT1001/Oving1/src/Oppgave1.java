import java.util.Scanner;

class Oppgave1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn tommer");
        double tommerLest = in.nextDouble();
        double centimeter = tommerLest * 2.54;
        System.out.println("Lengde i centimeter: " + centimeter + "cm");
    }
}