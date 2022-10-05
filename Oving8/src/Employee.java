import java.util.Calendar;

public class Employee {
    public Employee(Person person, int employmentNumber, int employmentYear, double monthlyGross, double taxRate) {
        this.person = person;
        this.employmentNumber = employmentNumber;
        this.employmentYear = employmentYear;
        this.monthlyGross = monthlyGross;
        this.taxRate = taxRate;
    }

    //class attributes
    private final Person person;
    private final int employmentNumber;
    private int employmentYear;
    private double monthlyGross;
    private double taxRate;

    //get methods
    public double getMonthlyGross() {
        return monthlyGross;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public int getEmploymentNumber() {
        return employmentNumber;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public String getFullName() {
        return person.getSurname() + ", " + person.getName();
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - person.getBirthYear();
    }

    public int getYearsOfEmployment() {
        return Calendar.getInstance().get(Calendar.YEAR) - getEmploymentYear();
    }

    public double getTaxPerMonth() {
        return getMonthlyGross() * getTaxRate();
    }

    public double getGrossSalary() {
        return getMonthlyGross() * 12;
    }

    public double getTaxPerYear() {
        return getTaxPerMonth() * 10 + getTaxPerMonth() / 2;
    }

    public boolean getEmployedForXYearsBool(int y) {
        return y > getYearsOfEmployment();
    }

    //set methods
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }

    public void setMonthlyGross(double monthlyGross) {
        this.monthlyGross = monthlyGross;
    }
}


