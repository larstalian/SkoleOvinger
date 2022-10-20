package Oppgave1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * The Oppgave1.EventRegister class contains the variable 'events' and 3 comparators used to sort
 * the events list by location, type and date/time. The comparators are lambda expressions which
 * compare each objects location to each other. Used with the .sort in the printEventsComparator
 * method it prints the event arraylist using the string builder.
 */
public class EventRegistry {

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

  public EventRegistry() {
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
  public boolean registerNewEvent(
      String eventId,
      String eventName,
      String eventLocation,
      String eventOrganizer,
      String eventType,
      String eventDate) {

    if (!eventExists(eventId)) {
      events.add(
          new Event(eventId, eventName, eventLocation, eventOrganizer, eventType, eventDate));
      return true;

    } else {
      return false;
    }
  }

  /**
   * A help method used by the 'registerNewEvent' method. This method checks if the provided event
   * ID is unique.
   *
   * @param eventId The provided event ID.
   * @return true if an event with the provided event ID already exists.
   */
  private boolean eventExists(String eventId) {
    for (Event event : events) {
      if (event.eventId().equals(eventId)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Finds all events on the provided location. The method creates a new arraylist of type
   * Oppgave1.Event and adds only the events with locations that matches the given location.
   *
   * @param eventLocation The given location.
   * @return a new arraylist containing only the events with the given location
   */
  public ArrayList<Event> findAllEventsOnLocation(String eventLocation) {
    return events.stream()
        .filter(event -> event.eventLocation().equals(eventLocation))
        .collect(Collectors.toCollection(ArrayList::new));
    //    ArrayList<Event> newList = new ArrayList<>();
    //    for (Event event : events) {
    //      if (event.eventLocation().equalsIgnoreCase(eventLocation)) {
    //        newList.add(event);
    //      }
    //    }
    //    return newList;
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
    long i = Long.parseLong(eventDateStart.replace(".", ""));
    long j = Long.parseLong(eventDateEnd.replace(".", ""));

    for (Event event : events) {
      long date = Long.parseLong(event.eventDate().replace(".", ""));

      if (date >= i && date <= j) {
        newList.add(event);
      }
      if (date > j) {
        break;
      }
    }
    return newList;
  }

  /**
   * Method to print the arraylist 'events' using the given comparator. Uses the 'stringBuilder'
   * method to build the String.
   *
   * @param l The given comparator.
   */
  public String printEventListComparator(Comparator<Event> l) {
    getEvents().sort(l);
    return stringBuilder(events);
  }

  /**
   * Method used to build the Sting of the arraylist 'events'.
   *
   * @param events The 'events' arraylist.
   */
  public String stringBuilder(ArrayList<Event> events) {
    StringBuilder s = new StringBuilder();

    if (!events.isEmpty()) {
      for (Event event : events) {
        s.append(event);
      }
      return String.valueOf(s);

    } else {
      return null;
    }
  }
}
