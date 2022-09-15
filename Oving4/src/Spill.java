public class Spill {
    public static void main(String[] args) {

        Spiller player1 = new Spiller("A");
        Spiller player2 = new Spiller("B");
        int i = 1;

        while (!player1.erFerdig() && !player2.erFerdig()) {
            System.out.println("Round: " + i);
            player1.throwDice();
            System.out.println(player1.getPlayer());
            System.out.println(player1.getSum());

            if (player1.getSum() < 100) {
                player2.throwDice();
                System.out.println(player2.getPlayer());
                System.out.println(player2.getSum());
            }
            i++;
        }

    }

}