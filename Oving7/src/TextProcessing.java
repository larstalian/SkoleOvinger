import java.util.Arrays;
import java.util.Scanner;

//Record class. Constructor is inside here somehow
public record TextProcessing(String text) {

    public String[] getWords() {
        return text().split(" ");
    }

    //Get methods
    public String[] getPeriods() {
        return text().split("[?:!.]+");
    }

    public int getNumberOfWords() {
        //Splits the text at whitespaces into arrays. Then counts the array instances and returns the int.
        return (int) Arrays.stream(text().split(" ")).count();
    }

    public double getAverageWordLength() {
        //Removes "," ".". Then splits into an array on the whitespaces and returns the average array instance length
        String[] words = text().replace(",", "").replace(".", "").split(" ");
        return Arrays.stream(words).mapToDouble(String::length).average().orElse(0);
    }

    public double getAveragePeriod() {
        //Splits the text on whitespaces in variable "words" and ?.:! in the variable "period". Then divides the word length with the period length
        return (float) getWords().length / getPeriods().length;
    }

    public String getTextUppercase() {
        //Gets the text in uppercase
        return text().toUpperCase();
    }

    public String changeWordsInText(String wordInput, String wordInputReplace) {
        //Changes an existing word in the text with the input
        return text().replaceAll(wordInput, wordInputReplace);
    }

    //Print methods
    public void methodPrinter(String s) {
        System.out.println(s);
    }

    public void methodPrinter(int i) {
        System.out.println("The text have " + i + " words.");
    }

    public void methodPrinter(double d) {
        System.out.printf("%.2f", d);
    }

    private static void client() {
        Scanner in = new Scanner(System.in);
        System.out.println("This program processes your text.\nWrite a text:");
        String textInput = in.nextLine();
        TextProcessing text = new TextProcessing(textInput);

        text.methodPrinter(text.getNumberOfWords());

        System.out.println("\nThe average word length is ");
        text.methodPrinter(text.getAverageWordLength());
        System.out.println(" characters per word");

        System.out.println("\n\nThe average period length is ");
        text.methodPrinter(text.getAveragePeriod());
        System.out.println(" words per period");

        System.out.println("\n\nYou can now replace a word in the text. Enter the word you wish to replace");
        String wordInput = in.nextLine();
        System.out.println("Enter the word you to replace " + wordInput + " with");
        String wordInputReplace = in.nextLine();

        System.out.println("\nThe new text is: ");
        text.methodPrinter(text.changeWordsInText(wordInput, wordInputReplace));

        System.out.println("\nThe original text is: ");
        text.methodPrinter(text.text());

        System.out.println("\nThe text in uppercase: ");
        text.methodPrinter(text.getTextUppercase());
    }

    public static void main(String[] args) {
        client();
    }
}
