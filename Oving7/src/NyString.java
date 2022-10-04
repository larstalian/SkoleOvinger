import java.util.Arrays;
import java.util.stream.Stream;

//Record class. Constructor is inside here somehow
public record NyString(String text) {

    //get methods
    public String[] getInitials() {
        //Splits the array at whitespaces. Then returns the first value of each instance
        String[] arrayNoWhitespace = text().split(" ");
        return Arrays.stream(arrayNoWhitespace).map(s -> s.substring(0, 1)).toArray(String[]::new);
    }

    public String[] getTextWithRemovedCharacter(String inputRemoveCharacter) {
        // Removes the character in lower case and in upper case from the text. Transforms the String to a String array to fit the print method
        return new String[]{text().replace(inputRemoveCharacter.toLowerCase(), "").replace(inputRemoveCharacter.toUpperCase(), "")};
    }

    //print method
    public void printArray(String[] array) {
        //Prints each array instance individually without fuss
        Stream.of(array).forEach(System.out::print);
    }
}