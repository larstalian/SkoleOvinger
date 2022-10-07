import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The NewString class creates a new string.
 *
 * @param text the input text.
 */
public record NewString(String text) {

    /**
     * Get method.
     *
     * @return returns the initials
     */
    public String[] getInitials() {
        //Splits the array at whitespaces. Then returns the first value of each instance
        String[] arrayNoWhitespace = text().split(" ");
        return Arrays.stream(arrayNoWhitespace).map(s -> s.substring(0, 1)).toArray(String[]::new);
    }

    /**
     * Removes the character in lower case and in upper case from the text.
     * Transforms the String to a String array to fit the print method.
     *
     * @param inputRemoveCharacter The character the actor wants to replace.
     * @return Returns the text with the character replaced.
     */

    public String[] getTextWithRemovedCharacter(String inputRemoveCharacter) {
        //
        return new String[]{text().replace(inputRemoveCharacter.toLowerCase(), "")
                .replace(inputRemoveCharacter.toUpperCase(), "")};
    }

    /**
     * toString method.
     *
     * @param array Prints the array.
     */
    public void toString(String[] array) {
        //Prints each array instance individually without fuss
        Stream.of(array).forEach(System.out::print);
    }
}