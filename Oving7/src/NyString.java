import java.util.Arrays;
import java.util.stream.Stream;

public class NyString {
    private final String text;

    public NyString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String[] getInitials() {
        String[] arrayNoWhitespace = getText().split(" ");
        return Arrays.stream(arrayNoWhitespace).map(s -> s.substring(0, 1)).toArray(String[]::new);
    }

    public void printArray(String[] array) {
        Stream.of(array).forEach(System.out::print);
    }

    public String[] removeCharacter(String inputRemoveCharacter) {
        return getText().split(inputRemoveCharacter);
    }
}