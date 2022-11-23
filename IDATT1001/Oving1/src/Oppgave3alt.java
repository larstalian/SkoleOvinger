import java.util.Scanner;

class Oppgave3alt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sekunder = in.nextInt();
        int timer = sekunder / 3600;
        int minutter = (sekunder / 60) - timer * 60;
        sekunder = sekunder - minutter * 60 - timer * 3600;
        System.out.println("Det er det samme som " + timer + " timer  " + minutter + " minutter og " + sekunder + " sekunder."); //test
    }
}
