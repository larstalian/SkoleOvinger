package Oppgave1;

/**
 * A record class containing the variables and constructor for creating a property object. The
 * property object is created in the 'PropertyRegistry' class through the method
 * 'registerNewProperty'. The record is immutable.
 *
 * @param municipalityName Number of the municipality
 * @param lotNumber The lot number
 * @param sectionNumber The section number
 * @param propertyName Name of the property, if any.
 * @param area The property area in quadratic meters
 * @param nameOfOwner Full name of the property owner
 */
public record Property(
    String municipalityName,
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
  public String toString() {

    return "Property:\n"
        + "Kommunenummer-gnr/bnr: "
        + municipalityName
        + "-"
        + lotNumber
        + "/"
        + sectionNumber
        + "  Property name: "
        + propertyName
        + "  Area: "
        + area
        + "  Name of owner: "
        + nameOfOwner;
  }
}
