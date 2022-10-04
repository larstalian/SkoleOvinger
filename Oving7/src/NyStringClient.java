import java.util.Scanner;

public class NyStringClient {
    //client method
    private static void client() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nThis program returns a text's initials and removes a chosen character from the text\nPlease enter text:");
        String textInput = in.nextLine();

        NyString text = new NyString(textInput);
        text.printArray(text.getInitials());

        System.out.println("\n\nEnter the character to remove ");
        String inputRemoveCharacter = in.next();

        System.out.println("Text with " + inputRemoveCharacter + " removed:");
        text.printArray(text.getTextWithRemovedCharacter(inputRemoveCharacter));
    }

    public static void main(String[] args) {
        client();
    }
}
