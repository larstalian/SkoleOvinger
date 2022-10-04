import java.util.Arrays;
import java.util.stream.Stream;

public record NyString(String text) {
    //get methods
    public String[] getInitials() {
        String[] arrayNoWhitespace = text().split(" ");
        return Arrays.stream(arrayNoWhitespace).map(s -> s.substring(0, 1)).toArray(String[]::new);
    }

    public String[] getTextWithRemovedCharacter(String inputRemoveCharacter) {
        return text().split(inputRemoveCharacter);
    }

    //print method
    public void printArray(String[] array) {
        Stream.of(array).forEach(System.out::print);
    }
}