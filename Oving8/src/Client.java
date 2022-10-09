import java.util.Scanner;

/**
 * Class that represents a client.
 */
public class Client {
    private static String taxToString(final double d) {
        return d * 100 + "%";
    }

    private static void menu() {
        System.out.println("""
                \nNow you can change your employment info. To exit type 5
                1. Change your tax rate
                2. Change your monthly gross
                3. Change your employment year
                4. Check if you have been employed for more than x years
                5. exit""");
    }
    public static void main(String[] args) {
        Person person = new Person("Aase", "Bredeli", 2000);
        Employee employee = new Employee(person, 1, 2020, 5000, 0.15);
        System.out.println("This program shows your person and employment information. " +
                "The program lets you change our employment information.\n");

        System.out.println("Name: " + employee.getFullName() + "\nAge: " + employee.getAge() +
                "\nEmployment number: " + employee.getEmploymentNumber() + "\nEmployed since: " +
                employee.getEmploymentYear() + "\nMonthly gross salary: " + employee.getMonthlyGross() + "kr" +
                "\nYearly gross salary: " + employee.getGrossSalary() + "kr" + "\nTax rate: " +
                taxToString(employee.getTaxRate()) + "\nYearly tax: " + employee.getTaxPerYear() + "kr");

        boolean run = true;
        while (run) {
            menu();

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter your new tax rate in decimals");
                    double input = in.nextDouble();
                    employee.setTaxRate(input);
                    System.out.println("Your new tax rate is: " + taxToString(employee.getTaxRate()) + "\nYearly tax is now: " + employee.getTaxPerYear());
                }
                case 2 -> {
                    System.out.println("Enter your new monthly gross: ");
                    double input = in.nextDouble();
                    employee.setMonthlyGross(input);
                    System.out.println("Your new monthly gross is " + employee.getMonthlyGross() + "kr" + "\nYour new yearly gross salary is: " + employee.getGrossSalary() + "kr" + "\nYour new yearly tax is: " + employee.getTaxPerYear() + "kr");
                }
                case 3 -> {
                    System.out.println("Enter your new employment year");
                    int input = in.nextInt();
                    employee.setEmploymentYear(input);
                    System.out.println("Your employment year is now " + employee.getEmploymentYear() + " and you have been employed for " + employee.getYearsOfEmployment() + " years");
                }
                case 4 -> {
                    System.out.println("Check if you have been employed more than x years. Please enter x in years");
                    int input = in.nextInt();
                    System.out.println("You have been employed for more than " + input + " years: " + employee.getEmployedForXYearsBool(input));
                }
                case 5 -> {
                    System.out.println("The program exits");
                    run = false;
                }
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
