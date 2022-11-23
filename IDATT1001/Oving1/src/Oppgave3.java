import static javax.swing.JOptionPane.*;

class Oppgave3 {
    public static void main(String[] args) {
        String sekunderLest = showInputDialog("Antall sekunder: ");
        int sekunder = Integer.parseInt(sekunderLest);
        int minutter = sekunder / 60; // finner minutter
        int timer;
        if (minutter > 0) {
            timer = minutter / 60;
            minutter = minutter - timer * 60;
        } else {
            timer = 0;
        }
        sekunder = sekunder % 60;
        showMessageDialog(null, "Det er det samme som " + timer + " timer  " + minutter + " minutter og " + sekunder + " sekunder.");
    }

}
