public final class CompositionName {
    private final String name;
    private final CompositionBirthday birthday;

    public CompositionName(String name, CompositionBirthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return String.format("Your name is %s and your birthday is %s", name, birthday);
    }
}