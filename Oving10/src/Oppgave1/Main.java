package Oppgave1;

import java.util.Scanner;

/** The main class. */
public class Main {
  /**
   * The main method.
   *
   * @param args main
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    EventRegistry run = new EventRegistry();
    boolean runClient = true;
    String stringInput;
    System.out.println("This program lets you register and sort events.");

    while (runClient) {
      menu();
      int choice = in.nextInt();

      switch (choice) {
        case 1 -> {
          System.out.println("Input must not contain whitespaces. For multiple words use: _");
          System.out.println("Oppgave1.Event ID:");
          String eventId = in.next();

          System.out.println("Oppgave1.Event menuName:");
          String eventName = in.next();

          System.out.println("Oppgave1.Event Location:");
          String eventLocation = in.next();

          System.out.println("Oppgave1.Event Organizer:");
          String eventOrganizer = in.next();

          System.out.println("Oppgave1.Event type:");
          String eventType = in.next();

          System.out.println("Oppgave1.Event date (yyyy.mm.dd.time):");
          String eventDate = in.next();
          eventDate = eventDate.replace(".", "");
          run.registerNewEvent(
              eventId, eventName, eventLocation, eventOrganizer, eventType, eventDate);
        }
        case 2 -> {
          System.out.println("Enter the location:");
          stringInput = in.next();
          try {
            run.printEventList(run.findAllEventsOnLocation(stringInput));
          } catch (Exception e) {
            System.out.println("There are no events on that location");
          }
        }
        case 3 -> {
          System.out.println("Enter the date in yyyy.mm.dd:");
          stringInput = in.next();

          try {
            run.printEventList(run.findAllEventsOnDate(stringInput.replace(".", "")));
          } catch (Exception e) {
            System.out.println("There are no events on that date");
          }
        }
        case 4 -> {
          System.out.println("Enter the start date in yyyy.mm.dd.time");
          stringInput = in.next();

          System.out.println("Enter the end date in yyyy.mm.dd.time");
          String stringInput2 = in.next();

          try {
            run.printEventList(
                run.allEventsInTimeFrame(
                    stringInput.replace(".", ""), stringInput2.replace(".", "")));

          } catch (Exception e) {
            System.out.println("There are no events in that time frame");
          }
        }
        case 5 -> {
          System.out.println(
              """
                      Make a choice:

                      Sort by:
                      1. Oppgave1.Event location
                      2. Oppgave1.Event time
                      3. Oppgave1.Event type""");
          int i1 = in.nextInt();

          switch (i1) {
            case 1 -> {
              System.out.println("Events sorted after location:");
              run.printEventListComparator(run.getEventSortLocation());
            }
            case 2 -> {
              System.out.println("Events sorted after time:");
              run.printEventListComparator(run.getEventSortDate());
            }
            case 3 -> {
              System.out.println("Events sorted after type:");
              run.printEventListComparator(run.getEventSortType());
            }
            default -> throw new IllegalStateException("Unexpected value: " + i1);
          }
        }
        case 6 -> {
          System.out.println("The program exits");
          runClient = false;
        }
        default -> throw new IllegalStateException("Unexpected value: " + choice);
      }
    }
  }

  /** Client menu method. */
  private static void menu() {
    System.out.println(
        """
            \nMake a choice:
            1. Register a new event
            2. Find all events on a given location
            3. Find all events on a given date
            4. Find all events within a time frame
            5. Sort events after time, location or event type
            6. Exit""");
  }
}
