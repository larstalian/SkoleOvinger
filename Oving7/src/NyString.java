import java.util.Arrays;
import java.util.stream.Stream;

public record NyString(String text) {

    //get methods
    public String[] getInitials() {
        String[] arrayNoWhitespace = text().split(" ");
        return Arrays.stream(arrayNoWhitespace).map(s -> s.substring(0, 1)).toArray(String[]::new);
    }

    public String[] getTextWithRemovedCharacter(String inputRemoveCharacter) {
        return new String[]{text().replace(inputRemoveCharacter, "").replace(inputRemoveCharacter.toUpperCase(), "")};
    }

    //print method
    public void printArray(String[] array) {
        Stream.of(array).forEach(System.out::print);
    }
}