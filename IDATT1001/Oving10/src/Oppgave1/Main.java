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
    EventRegistry run = new EventRegistry();
    Main m = new Main();

    // test data
    run.registerNewEvent("100", "Nice_Name", "Oslo", "Erik", "Festival", "2022.10.29.1800");
    run.registerNewEvent("101", "Bad_Name", "Oslo", "Erik", "Festival", "2022.10.29.1900");
    run.registerNewEvent("102", "Very_Nice_Name", "Trondheim", "Lars", "Party", "2022.10.30.1800");
    run.registerNewEvent("103", "Nice_Name", "Trondheim", "Erik", "Party", "2022.10.30.1900");
    // test data close

    System.out.println("This program lets you register and sort events.");

    boolean runClient = true;
    while (runClient) {
      menu();

      Scanner scanner1 = new Scanner(System.in);
      int choice = scanner1.nextInt();

      switch (choice) {
        case 1 -> {
          if (run.registerNewEvent(
              m.eventId(),
              m.eventName(),
              m.eventLocation(),
              m.eventOrganizer(),
              m.eventType(),
              m.eventDate())) {
            System.out.println("\nThe event has been created\n");

          } else {
            System.out.println("\nAn event with that ID already exists\n");
          }
        }

        case 2 -> {
          try {
            System.out.println(run.stringBuilder((run.findAllEventsOnLocation(m.eventLocation()))));

          } catch (Exception e) {
            System.out.println("There are no events on that location");
          }
        }

        case 3 -> {
          try {
            System.out.println("\nList of events on that date:");
            System.out.println(run.stringBuilder(run.findAllEventsOnDate(m.eventDate())));

          } catch (Exception e) {
            System.out.println("There are no events on that date");
          }
        }

        case 4 -> {
          System.out.println("Enter the start date, then the end date");
          try {
            System.out.println(
                run.stringBuilder(run.allEventsInTimeFrame(m.eventDate(), m.eventDate())));

          } catch (Exception e) {
            System.out.println("There are no events in that time frame");
            throw new RuntimeException(e);
          }
        }

        case 5 -> {
          System.out.println(
              """
                      Make a choice:

                      Sort by:
                      1. Event location
                      2. Event time
                      3. Event type""");

          Scanner scanner2 = new Scanner(System.in);
          int choice2 = scanner2.nextInt();

          switch (choice2) {
            case 1 -> {
              System.out.println("Events sorted after location:");
              System.out.println(run.printEventListComparator(run.getEventSortLocation()));
            }

            case 2 -> {
              System.out.println("Events sorted after time:");
              System.out.println(run.printEventListComparator(run.getEventSortDate()));
            }

            case 3 -> {
              System.out.println("Events sorted after type:");
              System.out.println(run.printEventListComparator(run.getEventSortType()));
            }

            default -> throw new IllegalStateException("Unexpected value: " + choice2);
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

  private String eventDate() {
    System.out.println("Event date (yyyy.mm.dd.time):");
    Scanner scanner = new Scanner(System.in);
    //    eventDate = eventDate.replace(".", "");
    return scanner.next();
  }

  private String eventType() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Event type:");
    return scanner.nextLine();
  }

  private String eventOrganizer() {
    System.out.println("Event Organizer:");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private String eventLocation() {
    System.out.println("Event Location:");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private String eventName() {
    System.out.println("Event Name:");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private String eventId() {
    System.out.println("Event ID:");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}
