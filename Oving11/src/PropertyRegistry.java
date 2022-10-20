import java.util.ArrayList;

/**
 * The PropertyRegistry class. The arraylist 'properties' is created in the constructor and is
 * final. The properties registered through the method 'registerNewProperty' are added to the list.
 * The class contains methods to register new properties, find a property using the municipality-,
 * lot- and section number the property resides in.
 */
public class PropertyRegistry {
  private final ArrayList<Property> properties;

  public PropertyRegistry() {
    properties = new ArrayList<>();
  }

  /**
   * Method to find all properties with a given lot number.
   *
   * @return an array list containing the properties with the matching lot number
   */
  public ArrayList<Property> allPropertiesWithLotNumberX(String lotIn) {
    ArrayList<Property> newList = new ArrayList<>();
    for (Property property : properties) {
      if (property.lotNumber().equals(lotIn)) {
        newList.add(property);
      }
    }
    return newList;
  }

  /**
   * Method for registering a new property. It adds the property object to the arraylist *
   * 'properties'.
   *
   * @param municipalityName Number of the municipality
   * @param municipalityNumber Name of the municipality
   * @param lotNumber The lot number
   * @param sectionNumber The section number
   * @param propertyName Name of the property, if any.
   * @param area The property area in quadratic meters
   * @param nameOfOwner Full name of the property owner
   * @return true if the property was registered
   */
  public boolean registerNewProperty(
      String municipalityName,
      String municipalityNumber,
      String lotNumber,
      String sectionNumber,
      String propertyName,
      double area,
      String nameOfOwner) {

    try {
      properties.add(
          new Property(
              municipalityName,
              municipalityNumber,
              lotNumber,
              sectionNumber,
              propertyName,
              area,
              nameOfOwner));
      return true;

    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Method to find properties using municipality-, * lot- and section number.
   *
   * @param municipalityNumber The municipality number
   * @param lotNumber The lot number
   * @param sectionNumber The section number
   * @return an arraylist of type Property containing the properties matching the params.
   */
  public Property findProperty(String municipalityNumber, String lotNumber, String sectionNumber) {
    for (Property property : properties) {
      if (property.municipalityNumber().equals(municipalityNumber)
          && property.lotNumber().equals(lotNumber)
          && property.sectionNumber().equals(sectionNumber)) {
        return property;
      }
    }
    return null;
  }

  /**
   * Get-method for the 'properties' arraylist.
   *
   * @return the 'properties' arraylist
   */
  public ArrayList<Property> getProperties() {
    return properties;
  }

  /**
   * Method to find the average area of all properties registered.
   *
   * @return the area.
   */
  public double averageAreaOfAllProperties() {
    double average = 0;
    for (Property property : properties) {
      average += property.area();
    }
    return average / properties.size();
  }

  public boolean deleteProperty(String municipalityNumber, String lotNumber, String sectionNumber) {
    try {
      properties.remove(findProperty(municipalityNumber, lotNumber, sectionNumber));
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public String arrayListPrinter(ArrayList<Property> properties) {
    StringBuilder s = new StringBuilder();
    for (Property property : properties) {
      if (property != null) s.append(property);
    }
    return String.valueOf(s);
  }
}
