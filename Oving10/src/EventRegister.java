import java.util.ArrayList;
import java.util.Comparator;

public class EventRegister {

  private final ArrayList<Event> events;
  public Comparator<Event> eventSortLocation =
      (o1, o2) -> {
        String eventLocation1 = o1.eventLocation().toUpperCase();
        String eventLocation2 = o2.eventLocation().toUpperCase();

        return eventLocation1.compareTo(eventLocation2);
      };
  public Comparator<Event> eventSortType =
      (o1, o2) -> {
        String eventType1 = o1.eventType().toUpperCase();
        String eventType2 = o2.eventType().toUpperCase();

        return eventType1.compareTo(eventType2);
      };
  public Comparator<Event> eventSortDate =
      (o1, o2) -> {
        String evenTime1 = o1.eventDate();
        String eventTime2 = o2.eventDate();

        return evenTime1.compareTo(eventTime2);
      };

  public EventRegister() {
    events = new ArrayList<>();
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
    for (Event event : events) {
      if (event.eventId().equals(eventId)) {
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
    for (Event event : events) {
      if (event
          .eventDate()
          .substring(0, eventDate.length() - 2)
          .equals(eventDate.substring(0, eventDate.length() - 2))) {
        newList.add(event);
      }
    }
    return newList;
  }

  public ArrayList<Event> allEventsInTimeFrame(int eventDateStart, int eventDateEnd) {
    ArrayList<Event> newList = new ArrayList<>();
    for (int i = 0; i < eventDateEnd; i++) {
      Event event = events.get(i);
      if (Integer.parseInt(event.eventDate()) > eventDateStart) {
        newList.add(event);
      }
    }
    return newList;
  }

  public ArrayList<Event> newEventList() {

    return null;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    for (Event event : events) {
      s.append("EventID: ")
              .append(event.eventId())
          .append(", Event name: ")
          .append(event.eventName())
          .append(", Event Location: ")
          .append(event.eventLocation())
          .append(", Event Organizer: ")
          .append(event.eventOrganizer())
          .append(", Event Type: ")
          .append(event.eventType())
          .append(", Event Date: ")
          .append(event.eventDate())
          .append("\n\n");
    }
    return s.toString();
  }
}
