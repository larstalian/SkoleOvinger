/**
 * A record class containing the variables and constructor for creating a property object. The
 * property object is created in the 'PropertyRegistry' class through the method
 * 'registerNewProperty'. The record is immutable.
 *
 * @param municipalityName Number of the municipality
 * @param municipalityNumber Name of the municipality
 * @param lotNumber The lot number
 * @param sectionNumber The section number
 * @param propertyName Name of the property, if any.
 * @param area The property area in quadratic meters
 * @param nameOfOwner Full name of the property owner
 */
public record Property(
    String municipalityName,
    String municipalityNumber,
    String lotNumber,
    String sectionNumber,
    String propertyName,
    double area,
    String nameOfOwner) {

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
}
