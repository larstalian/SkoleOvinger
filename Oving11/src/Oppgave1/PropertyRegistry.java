package Oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The PropertyRegistry class. The arraylist 'properties' is created in the constructor and is
 * final. The properties registered through the method 'registerNewProperty' are added to the list.
 * The class contains methods to register new properties, find a property using the municipality-,
 * lot- and section number the property resides in.
 */
public class PropertyRegistry {
  private final ArrayList<Property> properties;

  Scanner in = new Scanner(System.in);

  public PropertyRegistry() {
    properties = new ArrayList<>();
  }

  /**
   * Method for registering a new property. It adds the property object to the arraylist
   * 'properties'.
   */
  public void registerNewProperty() {

    System.out.println("Enter the municipality number the property resides in");
    String municipalityName = in.next();

    System.out.println("Enter the lot number");
    String lotNumber = in.next();

    System.out.println("Enter the section number");
    String sectionNumber = in.next();

    System.out.println("Enter the property name, if the property has no name, enter -");
    String propertyName = in.next();

    System.out.println("Enter the property area in quadratic meters");
    double area = in.nextDouble();

    System.out.println("Enter the full name of Owner with '_' as whitespaces");
    String nameOfOwner = in.next();

    properties.add(
        new Property(municipalityName, lotNumber, sectionNumber, propertyName, area, nameOfOwner));
    System.out.println("The property has been registered");
  }

  /**
   * Method to find properties using municipality-, * lot- and section number.
   *
   * @param municipalityNumber The municipality number
   * @param lotNumber The lot number
   * @param sectionNumber The section number
   * @return an arraylist of type Property containing the properties matching the params.
   */
  public ArrayList<Property> findProperty(
      String municipalityNumber, String lotNumber, String sectionNumber) {

    ArrayList<Property> newList = new ArrayList<>();
    for (Property property : properties)
      if (property.municipalityName().equalsIgnoreCase(municipalityNumber)
          && property.lotNumber().equals(lotNumber)
          && property.sectionNumber().equals(sectionNumber)) {
        newList.add(property);
      }
    return newList;
  }

  /**
   * Get-method for the 'properties' arraylist.
   *
   * @return the 'properties' arraylist
   */
  public ArrayList<Property> getProperties() {
    return properties;
  }

  /** Method to find the average area of all properties registered. */
  public void averageAreaOfAllProperties() {
    double average = 0;
    for (Property property : properties) {
      average += property.area();
    }
    average = average / properties.size();
    System.out.printf("The average area of the properties registered is %s\n\n", average);
  }
}
