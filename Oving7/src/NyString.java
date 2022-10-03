import java.util.Arrays;
import java.util.Scanner;

public class NyString {
//    Klassen String inneholder mange metoder. Vi skal nå lage noen flere.
//    Lag en klasse som heter NyString. Den skal ha en objektvariabel av klassen String. Klassen NyString skal være immutabel og tilby følgende tjenester:
//            • Konstruktør som tar et objekt av klassen String som argument.
//            • Forkorting. Forkortingen skal skje ved at første tegn i hvert ord plukkes ut.
//              Bruk mellomrom som skille mellom ordene. Eksempel: «denne setningen kan forkortes» skal forkortes til «dskf».
//              Tips: Bruk String-metoden split(), som returnerer en tabell med ordene som teksten består av: String() ord = tekst.split()
//            • Fjerning av tegn. Eksempel: Dersom tegnet ‘e’ fjernes fra teksten «denne setningen kan forkortes», står vi igjen
//            med «dnn stningn kan forkorts». Tips: Bruk en while-løkke og for eksempel String-metodene indexOf() og substring().

    private final String tekst;

    public NyString(String tekst) {
        this.tekst = tekst;
    }

    public String[] shortening() {
        String[] result = new String[tekst.length()];
        for (int i = 0; i < tekst.length(); i++) {
            String letter = String.valueOf(tekst.charAt(i));
            int[] shortened;
            if (letter.equals(" ")) {
                result[i] = String.valueOf(tekst.charAt(i + 1));
            }
        }
        return result;
    }

    public String removeSign() {

        return null;
    }

    public void printText(String[] result) {
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tekst = in.next();
        NyString object = new NyString(tekst);
        object.printText(object.shortening());


    }

}
