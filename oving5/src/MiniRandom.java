import java.util.Random;
import java.util.Scanner;

public class MiniRandom {

    public static int nextWholeNumber(int under, int over) {
        Random random = new Random(); //objekt av random klassen
        return random.nextInt(under, over);
    }

    public static double nextDecimal(double under, double over) {
        Random random = new Random(); //objekt av random klassen
        return random.nextDouble(under, over); //
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //kjører tester:
        int testInt = nextWholeNumber(5, 10);
        int testInt2 = nextWholeNumber(1, 10);
        int testInt3 = nextWholeNumber(2, 4);
        int testInt4 = nextWholeNumber(-10, -5);
        double testDouble = nextDecimal(2, 3);
        double testDouble2 = nextDecimal(7, 8);
        double testDouble3 = nextDecimal(4, 5);
        double testDouble4 = nextDecimal(1, 2);
        System.out.println(testInt);
        System.out.println(testInt2);
        System.out.println(testInt3);
        System.out.println(testInt4);
        System.out.println(testDouble);
        System.out.println(testDouble2);
        System.out.println(testDouble3);
        System.out.println(testDouble4);


    }
}
