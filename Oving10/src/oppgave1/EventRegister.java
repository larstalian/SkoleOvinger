package oppgave1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * The Oppgave1.EventRegister class contains the variable 'events' and 3 comparators used to sort
 * the events list by location, type and date/time. The comparators are lambda expressions which
 * compare each objects location to each other. Used with the .sort in the printEventsComparator
 * method it prints the event arraylist using the string builder.
 */
public class EventRegister {

  private final ArrayList<Event> events;
  private final Comparator<Event> eventSortLocation =
      (o1, o2) -> {
        String eventLocation1 = o1.eventLocation().toUpperCase();
        String eventLocation2 = o2.eventLocation().toUpperCase();

        return eventLocation1.compareTo(eventLocation2);
      };
  private final Comparator<Event> eventSortType =
      (o1, o2) -> {
        String eventType1 = o1.eventType().toUpperCase();
        String eventType2 = o2.eventType().toUpperCase();

        return eventType1.compareTo(eventType2);
      };
  private final Comparator<Event> eventSortDate =
      (o1, o2) -> {
        String evenTime1 = o1.eventDate();
        String eventTime2 = o2.eventDate();

        return evenTime1.compareTo(eventTime2);
      };

  public EventRegister() {
    events = new ArrayList<>();
  }

  public ArrayList<Event> getEvents() {
    return events;
  }

  public Comparator<Event> getEventSortLocation() {
    return eventSortLocation;
  }

  public Comparator<Event> getEventSortType() {
    return eventSortType;
  }

  public Comparator<Event> getEventSortDate() {
    return eventSortDate;
  }

  /**
   * Method for registering a new event. The method calls the 'eventExists' method to check if an
   * event with the ID provided already exists. Then, if the event ID is unique, the event is added
   * to the arraylist 'events'.
   *
   * @param eventId The unique event id
   * @param eventName The event menuName
   * @param eventLocation The event location
   * @param eventOrganizer The event organizer
   * @param eventType The event type
   * @param eventDate The event date
   */
  public void registerNewEvent(
      String eventId,
      String eventName,
      String eventLocation,
      String eventOrganizer,
      String eventType,
      String eventDate) {

    if (!eventExists(eventId)) {
      events.add(
          new Event(eventId, eventName, eventLocation, eventOrganizer, eventType, eventDate));

    } else {
      System.out.println("An event with that ID already exists");
    }
  }

  /**
   * A help method used by the 'registerNewEvent' method. This method checks if the provided event
   * ID is unique.
   *
   * @param eventId The provided event ID.
   * @return true if an event with the provided event ID already exists.
   */
  public boolean eventExists(String eventId) {
    boolean b = false;
    for (Event event : events) {
      if (event.eventId().equals(eventId)) {
        b = true;
        break;
      }
    }
    return b;
  }

  /**
   * Finds all events on the provided location. The method creates a new arraylist of type
   * Oppgave1.Event and adds only the events with locations that matches the given location.
   *
   * @param eventLocation The given location.
   * @return a new arraylist containing only the events with the given location
   */
  public ArrayList<Event> findAllEventsOnLocation(String eventLocation) {
    ArrayList<Event> newList = new ArrayList<>();
    for (Event event : events) {
      if (event.eventLocation().equalsIgnoreCase(eventLocation)) {
        newList.add(event);
      }
    }
    return newList;
  }

  /**
   * Method to find all events on the given date. The method creates a new arraylist of type
   * Oppgave1.Event and adds only the events with the date that matches the given date.
   *
   * @param findOnThisDate the given date
   * @return a new arraylist containing only the events with the given date
   */
  public ArrayList<Event> findAllEventsOnDate(String findOnThisDate) {
    ArrayList<Event> newList = new ArrayList<>();
    for (Event event : events) {
      if (event.eventDate().startsWith(findOnThisDate)) {
        newList.add(event);
      }
    }
    return newList;
  }

  /**
   * Method for finding all events in a given time frame. The method creates a new arraylist of type
   * Oppgave1.Event and adds only the events within the given time frame.
   *
   * @param eventDateStart The beginning date
   * @param eventDateEnd The end date
   * @return a new arraylist containing only the events within the time frame
   */
  public ArrayList<Event> allEventsInTimeFrame(String eventDateStart, String eventDateEnd) {
    ArrayList<Event> newList = new ArrayList<>();
    for (int i = 0; i < Integer.parseInt(eventDateEnd); i++) {
      Event event = events.get(i);
      if (Integer.parseInt(event.eventDate()) > Integer.parseInt(eventDateStart)) {
        newList.add(event);
      }
    }
    return newList;
  }

  /**
   * Method to print a given arraylist of type Oppgave1.Event if the arraylist is not empty. Uses
   * the 'stringBuilder' method to build the String.
   *
   * @param l The given arraylist
   */
  public void printEventList(ArrayList<Event> l) {
    if (l.isEmpty()) {
      System.out.println("There are no events");
    } else {
      stringBuilder(l);
    }
  }

  /**
   * Method to print the arraylist 'events' using the given comparator. Uses the 'stringBuilder'
   * method to build the String.
   *
   * @param l The given comparator.
   */
  public void printEventListComparator(Comparator<Event> l) {
    getEvents().sort(l);
    stringBuilder(events);
  }

  /**
   * Method used to build the Sting of the arraylist 'events'.
   *
   * @param events The 'events' arraylist.
   */
  private void stringBuilder(ArrayList<Event> events) {
    StringBuilder s = new StringBuilder();
    for (Event event : events) {
      s.append("\nEventID: ")
          .append(event.eventId())
          .append("\nOppgave1.Event menuName: ")
          .append(event.eventName())
          .append("\nOppgave1.Event Location: ")
          .append(event.eventLocation())
          .append("\nOppgave1.Event Organizer: ")
          .append(event.eventOrganizer())
          .append("\nOppgave1.Event Type: ")
          .append(event.eventType())
          .append("\nOppgave1.Event Date: ")
          .append(event.eventDate())
          .append("\n");
    }
    System.out.println(s);
  }
}
