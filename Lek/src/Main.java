import java.io.InputStream;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%tc", new Date());
        for (int i = 10; i > 0; i--)
            System.out.println("Counting down . . . " + i);
        System.out.println("Blastoff!");

        System.out.printf("\nWhats your name? ");
        String firstname = in.nextLine();
        System.out.println("You're first name is: " + firstname);
        int age = in.nextInt();
        System.out.println(age);
    }
}