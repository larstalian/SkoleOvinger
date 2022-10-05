public final class Person {
    public Person(String name, String surname, int birthYear) {
        Person.name = name;
        Person.surname = surname;
        Person.birthYear = birthYear;
    }

    //class attributes
    private static int birthYear;
    private static String surname;
    private static String name;


    //get methods
    public int getBirthYear() {
        return birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
