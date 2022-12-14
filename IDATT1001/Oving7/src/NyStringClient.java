import java.util.Scanner;

public class NyStringClient {
  // client method
  private static void client() {
    Scanner in = new Scanner(System.in);

    System.out.println(
        "\nThis program returns a text's initials and removes a chosen character from the text\nPlease enter a text:");
    String textInput = in.nextLine();

    NewString text = new NewString(textInput);
    text.toString(text.getInitials());

    System.out.println("\n\nEnter the character you wish to remove ");
    String inputRemoveCharacter = in.next();

    System.out.println("Text with " + inputRemoveCharacter + " removed:");
    text.toString(text.getTextWithRemovedCharacter(inputRemoveCharacter));
  }

  public static void main(String[] args) {
    client();
  }
}
