package Oppgave1;

/**
 * The record for Oppgave1.Event. The record represents the immutable class Oppgave1.Event. It contains the variables,
 * constructor and get-methods of an immutable class.
 *
 * @param eventId The unique event id
 * @param eventName The event menuName
 * @param eventLocation The event location
 * @param eventOrganizer The event organizer
 * @param eventType The event type
 * @param eventDate The event date
 */
public record Event(
    String eventId,
    String eventName,
    String eventLocation,
    String eventOrganizer,
    String eventType,
    String eventDate) {}
