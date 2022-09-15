import java.util.Random;

public class Spiller {
    private int sum = 0;
    private final String player;

    public Spiller(String player) {
        this.player = ("Player " + player + ":");
    }

    public void setSum(int sum){
        this.sum = sum;
    }
    public String getPlayer() {
        return player;
    }

    public void throwDice() {
        Random dice = new Random();
        int n = dice.nextInt(6);
        if (n == 1) {
            this.sum = 0;
        } else {
            this.sum += n;
        }
    }

    public int getSum() {
        return sum;

    }


    public boolean erFerdig() {
        return getSum() >= 100;
    }
}