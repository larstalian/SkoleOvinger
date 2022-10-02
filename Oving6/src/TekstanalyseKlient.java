import java.util.Scanner;

public class TekstanalyseKlient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Skriv inn tekst du ønsker å analysere: ");
            String textInput = in.nextLine();
            System.out.println("\nAntall bokstaver/spesialtegn av hver type er: ");
            Textanalyse tekst = new Textanalyse(textInput);

            System.out.println("""
                                        
                    Nå kan du velge å gjøre en av følgende operasjoner:\s
                    1. Finn antall unike bokstaver i teksten\s
                    2. Finn sum av bokstaver i teksten\s
                    3. Finn andel spesialtegn i teksten i prosent\s
                    4. Finn forekomst av valgt bokstav
                    5. Finn bokstaven(e) som forekommer oftest""");

            int valg = in.nextInt();
            switch (valg) {
                case 1 -> tekst.forskjelligeBokstaver();
                case 2 -> tekst.sumBokstaver();
                case 3 -> tekst.spesialtegnProsent();
                case 4 -> {
                    System.out.println("Velg bokstav du vil finne: ");
                    String nyBokstav = in.next();
                    tekst.antallSpesifikkBokstav(nyBokstav);
                }
                case 5 -> tekst.forekommerOftest();
                case 6 -> run = false;
            }
            System.out.println("\nTrykk 6 for å avslutte");
        }
    }
}
