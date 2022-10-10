import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    EventRegister run = new EventRegister();
    Scanner in = new Scanner(System.in);
    Scanner inInt = new Scanner(System.in);

    while (true) {
      System.out.println("Make a choice");
      menu();
      int choice = in.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Event ID:");
          String eventId = in.next();

          System.out.println("Event name:");
          String eventName = in.next();

          System.out.println("Event Location:");
          String eventLocation = in.next();

          System.out.println("Event Organizer:");
          String eventOrganizer = in.next();

          System.out.println("Event type:");
          String eventType = in.next();

          System.out.println("Event date:");
          String eventDate = in.next();
          run.registerNewEvent(
              eventId, eventName, eventLocation, eventOrganizer, eventType, eventDate);
          break;
        case 2:
          System.out.println(run);
      }
    }
  }

  public static void menu() {
    System.out.println(
        """
            1. Register a new event
            2. Find all events on a given location
            3. Find all events on a given date
            4. Find all events within a time frame
            5. Sort events after time, location or event type
            6. Exit""");
  }
}
