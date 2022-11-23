import java.util.Objects;

/**
 * A record class containing the variables and constructor for creating a property object. The
 * property object is created in the 'PropertyRegistry' class through the method
 * 'registerNewProperty'. The record is immutable.
 */
public final class Property {
  private final String municipalityName;
  private final String municipalityNumber;
  private final String lotNumber;
  private final String sectionNumber;
  private final String propertyName;
  private final double area;
  private final String nameOfOwner;

  /**
   * @param municipalityName   Number of the municipality
   * @param municipalityNumber Name of the municipality
   * @param lotNumber          The lot number
   * @param sectionNumber      The section number
   * @param propertyName       Name of the property, if any.
   * @param area               The property area in quadratic meters
   * @param nameOfOwner        Full name of the property owner
   */
  public Property(String municipalityName, String municipalityNumber, String lotNumber, String sectionNumber, String propertyName, double area, String nameOfOwner) {
    this.municipalityName = municipalityName;
    this.municipalityNumber = municipalityNumber;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.propertyName = propertyName;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  /**
   * toString method to print an object of type Property.
   *
   * @return the string
   */
  @Override
  public String toString() {

    return "\nKommunenummer-gnr/bnr: "
            + municipalityNumber
            + "-"
            + lotNumber
            + "/"
            + sectionNumber
            + "\nKommunens navn: "
            + municipalityName
            + "\nEiendommens navn: "
            + propertyName
            + "\nAreal: "
            + area
            + " m^2 "
            + "\nEier: "
            + nameOfOwner
            + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Property) obj;
    return Objects.equals(this.municipalityName, that.municipalityName)
            && Objects.equals(this.municipalityNumber, that.municipalityNumber)
            && Objects.equals(this.lotNumber, that.lotNumber)
            && Objects.equals(this.sectionNumber, that.sectionNumber)
            && Objects.equals(this.propertyName, that.propertyName)
            && Double.doubleToLongBits(this.area) == Double.doubleToLongBits(that.area)
            && Objects.equals(this.nameOfOwner, that.nameOfOwner);
  }

  public String municipalityName() {
    return municipalityName;
  }

  public String municipalityNumber() {
    return municipalityNumber;
  }

  public String lotNumber() {
    return lotNumber;
  }

  public String sectionNumber() {
    return sectionNumber;
  }

  public String propertyName() {
    return propertyName;
  }

  public double area() {
    return area;
  }

  public String nameOfOwner() {
    return nameOfOwner;
  }

  @Override
  public int hashCode() {
    return Objects.hash(municipalityName, municipalityNumber, lotNumber, sectionNumber, propertyName, area, nameOfOwner);
  }


}
