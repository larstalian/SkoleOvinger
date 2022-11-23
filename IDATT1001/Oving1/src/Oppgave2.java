import static javax.swing.JOptionPane.*;

class Oppgave2 {
    public static void main(String[] args) {
        String timerLest = showInputDialog("Timer(I hele tall):");
        String minutterLest = showInputDialog("Minutter(I hele tall):");
        String sekunderLest = showInputDialog("Sekunder:");
        int timer = Integer.parseInt(timerLest);
        int minutter = Integer.parseInt(minutterLest);
        int sekunder = Integer.parseInt(sekunderLest);
        int totsekunder = timer * 3600 + minutter * 60 + sekunder;
        showMessageDialog(null, "Tid i sekunder er: " + totsekunder + " sekunder");
    }
}
