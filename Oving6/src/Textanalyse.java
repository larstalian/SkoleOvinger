import java.util.Arrays;

public class Textanalyse {

    private final int[] antallTegn = new int[30];
    private final String alfabet = "abcdefghijklmnopqrstuvwxyzæøå.";
    private final String tekst;


    //Konstruktør for å analysere objektet tekst
    public Textanalyse(String tekst) {
        this.tekst = tekst;
        antallTegn();

        for (int i = 0; i < antallTegn.length; i++) { //print looper for hver bokstav i alfabetet
            System.out.println("Antall forekomster av " + alfabet.charAt(i) + ": " + antallTegn[i]);
        }
        System.out.println("Antall forekomster av spesialtegn: " + antallTegn[29]); //Lager unntak for spesialtegn
    }

    public void sumBokstaver() {
        System.out.println("Totalt antall bokstaver er: " + (Arrays.stream(antallTegn).sum() - antallTegn[29]));
    }

    public void forskjelligeBokstaver() {
        int x = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            if (antallTegn[i] != 0) {
                x++;
            }
        }
        System.out.println("Antall forskjellige bokstaver i teksten er: " + x);
    }

    public void spesialtegnProsent() {
        double[] arrayDouble = Arrays.stream(antallTegn).asDoubleStream().toArray(); //kopierer/formatterer til double
        System.out.printf("Spesialtegn utgjør %.2f%% av teksten", 100 * (arrayDouble[29] / (Arrays.stream(arrayDouble).sum())));
    }

    public void antallTegn() {
        for (int i = 0; i < tekst.length(); i++) {
            int bokstavIndex = alfabet.indexOf(tekst.toLowerCase().charAt(i)); //lager en variabel der man sammenligner en char i teksten med en char i alfabetet.
            if (bokstavIndex == -1) { // legger till tegn på 29.
                antallTegn[29]++;
            } else {
                antallTegn[bokstavIndex]++;
            }
        }
    }

    public void antallSpesifikkBokstav(String bokstav) {
        boolean fantBokstav = false;
        int bokstaven = alfabet.indexOf(bokstav.toLowerCase());
        for (int i = 0; i < tekst.length(); i++) {
            int bokstavIndex = alfabet.indexOf(tekst.toLowerCase().charAt(i));
            if (bokstavIndex == bokstaven) {
                System.out.println("\nBokstaven " + bokstav + " forekommer " + antallTegn[bokstavIndex] + " ganger i teksten");
                fantBokstav = true;
                break;
            }
        }
        if (!fantBokstav) {
            System.out.println("Bokstaven finnes ikke i teksten");
        }
    }

    public void forekommerOftest() {
        int hoyest = -1;
        StringBuilder hoyestBokstav = new StringBuilder();
        for (int i = 0; i < (antallTegn.length - 1); i++) {
            if (antallTegn[i] > hoyest) {
                hoyest = antallTegn[i];
                hoyestBokstav = new StringBuilder(String.valueOf(alfabet.charAt(i)));
            } else if (antallTegn[i] == hoyest) {
                hoyestBokstav.append(", ").append(alfabet.charAt(i));
            }
        }
        System.out.println( "Bokstaven(e) som forekommer oftest er \"" + hoyestBokstav + "\" (" + hoyest + " ganger)");
    }
//        System.out.println("Bokstaven " + Arrays.stream(antallTegn).    + " forekommer oftest og forekommer " + antallTegn[alfabet.indexOf(tekst.toLowerCase().charAt(max))] + " antall ganger");
}

