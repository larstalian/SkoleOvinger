import java.util.ArrayList;
import java.util.Objects;

public class EventRegister {

  private ArrayList<Event> events;

  public EventRegister() {
    ArrayList<Event> events;
  }

  public void registerNewEvent(
      String eventId,
      String eventName,
      String eventLocation,
      String eventOrganizer,
      String eventType,
      String eventDate) {

    if (eventExists(eventId)) {
      events.add(
          new Event(eventId, eventName, eventLocation, eventOrganizer, eventType, eventDate));

    } else {
      System.out.println("An event with that ID already exists");
    }
  }

  public boolean eventExists(String eventId) {
    boolean b = true;
    for (Event value : events) {
      if (Objects.equals(value.eventId(), eventId)) {
        b = false;
        break;
      }
    }
    return b;
  }

  public int findEventById(String eventId) {
    int index = -1;
    for (int i = 0; i < events.size(); i++) {
      if (events.get(i).eventId().equals(eventId)) {
        index = i;
        break;
      }
    }
    return index;
  }

  public ArrayList<Event> findAllEventsOnLocation(String eventLocation) {
    ArrayList<Event> newList = new ArrayList<>();
    for (Event event : events) {
      if (event.eventLocation().equals(eventLocation)) {
        newList.add(event);
      }
    }
    return newList;
  }

  public ArrayList<Event> allEventsOnDate(String eventDate) {
    ArrayList<Event> newList = new ArrayList<>();
    eventDate = eventDate.substring(0, eventDate.length() - 2);
    for (Event event : events) {
      if (event.eventDate().substring(0, eventDate.length() - 2).equals(eventDate.substring(0, eventDate.length() - 2))) {
        newList.add(event);
    }
    return newList;
  }

  public Event allEventsInTimeFrame() {
    // Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal
    // være sortert på tid.
    return null;
  }

  public ArrayList<Event> newEventList() {
    // Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og
    // tidspunkt.
    return null;
  }

  // Lag et menystyrt klientprogram.
}
