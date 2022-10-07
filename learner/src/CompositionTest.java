public class CompositionTest {
    public static void main(String[] args) {
        CompositionBirthday birthdayObject = new CompositionBirthday(3, 4, 5);
        CompositionName nameObject = new CompositionName("Talian",birthdayObject);

        System.out.println(nameObject);
    }
}
