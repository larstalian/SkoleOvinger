import java.util.Scanner;

public class StaticInitializerBlock {


    private static int height;
    private static int length;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        height = in.nextInt();
        length = in.nextInt();

        if (length >= 0 && height >= 0) {
            System.out.println(length * height);
        } else {
            throw new Exception ("Breadth and height must be positive");
        }
    }
}
