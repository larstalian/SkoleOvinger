import java.util.Calendar;

public class Employee {
  private final Person person;
  private final int employmentNumber;

  // can change with set methods
  private int employmentYear;
  private double monthlyGross;
  private double taxRate;

  /**
   * @param person Person object
   * @param employmentNumber Employment number
   * @param employmentYear Employment year
   * @param monthlyGross Monthly gross
   * @param taxRate Tax rate
   */
  public Employee(
      Person person,
      int employmentNumber,
      int employmentYear,
      double monthlyGross,
      double taxRate) {
    this.person = person;
    this.employmentNumber = employmentNumber;
    this.employmentYear = employmentYear;
    this.monthlyGross = monthlyGross;
    this.taxRate = taxRate;
  }

  // get methods
  public double getMonthlyGross() {
    return monthlyGross;
  }

  public void setMonthlyGross(double monthlyGross) {
    this.monthlyGross = monthlyGross;
  }

  public double getTaxRate() {
    return taxRate;
  }

  // set methods
  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  public int getEmploymentNumber() {
    return employmentNumber;
  }

  public int getEmploymentYear() {
    return employmentYear;
  }

  public void setEmploymentYear(int employmentYear) {
    this.employmentYear = employmentYear;
  }

  public String getFullName() {
    return person.surname() + ", " + person.name();
  }

  public int getAge() {
    return Calendar.getInstance().get(Calendar.YEAR) - person.birthYear();
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
}
