import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean leapYear = false;
        int isLeapYear = in.nextInt();
        if (isLeapYear % 4 == 0) leapYear = true;
        if (isLeapYear % 100 == 0) if (isLeapYear % 400 != 0) leapYear = false;
        System.out.println("Is a Leap Year:");
        System.out.println(leapYear);
    }
}