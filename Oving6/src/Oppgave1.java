public class Oppgave1 {
    int[] amount = new int[10]; //creates array amount
    java.util.Random random = new java.util.Random(); //random object

    public void generator() {

        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(10); // generates new number
            amount[number] = amount[number] + 1; // occasions of number x is added to array amount
        }
        for (int i = 0; i < amount.length; i++) {
            System.out.println("Number of occasions of number " + i + ":");
            System.out.println(amount[i] + "\n");
        }
    }

    public static void main(String[] args) {
        Oppgave1 run = new Oppgave1();
        run.generator();
    }
}