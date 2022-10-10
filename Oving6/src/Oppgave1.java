public class Oppgave1 {
  static int[] amount = new int[10]; // creates an array named amount
  static java.util.Random random = new java.util.Random(); // Creates the 'random' object

  public static void generator() {

    for (int i = 0; i < 10000; i++) {
      int number = random.nextInt(10); // generates new number between 1 and 10
      amount[number] = amount[number] + 1; // occasions of number x is added to the array 'amount'
    }
    for (int i = 0; i < amount.length; i++) {
      System.out.println("Number of occasions of number " + i + ":");
      System.out.println(amount[i] + "\n");
    }
  }

  public static void main(String[] args) {
    generator();
  }
}
