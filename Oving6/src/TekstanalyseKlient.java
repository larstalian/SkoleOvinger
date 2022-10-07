import java.util.Scanner;

/**
 * Klasse.
 */
public class TekstanalyseKlient {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        boolean sammeTekst = true;
        System.out.println("Dette programmet analyserer teksten du skriver inn");

        while (run) {
            System.out.println("\nSkriv inn tekst du ønsker å analysere: ");
            String textInput = in.nextLine();
            System.out.println("\nAntall bokstaver/spesialtegn av hver type er: ");
            Textanalyse tekst = new Textanalyse(textInput);
            while (sammeTekst) {

                System.out.println("""
                                            
                        Nå kan du velge å gjøre en av følgende operasjoner:\s
                        1. Finn antall unike bokstaver i teksten\s
                        2. Finn sum av bokstaver i teksten\s
                        3. Finn andel spesialtegn i teksten i prosent\s
                        4. Finn forekomst av valgt bokstav
                        5. Finn bokstaven(e) som forekommer oftest
                        6. Skriv inn ny tekst
                        7. Avslutt""");


                int valg = in.nextInt();
                switch (valg) {
                    case 1 -> tekst.forskjelligeBokstaver();
                    case 2 -> tekst.sumBokstaver();
                    case 3 -> tekst.spesialtegnProsent();
                    case 4 -> tekst.antallSpesifikkBokstav();
                    case 5 -> tekst.forekommerOftest();
                    case 6 -> sammeTekst = false; //gjør at bruker kan skrive inn ny tekst
                    case 7 -> run = false; //avslutter programmet
                    default -> throw new IllegalStateException("Unexpected value: " + valg);
                }
                System.out.println("\nTrykk 7 for å avslutte");
            }
        }
    }
}
