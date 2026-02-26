import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    /*Problem 2:
Develop a Java application that helps a global team schedule meetings across different time
zones. The application should allow users to create an event by specifying a date and time, view
the event in a different time zone, and calculate the days until the event. Nicely show the date
and time display.
Requirements:
1. Create an Event to the input the details and print the requested details:
a. Allow users to input the event name, date and time for a new event.
b. Display the day of the week (Eg: Sunday, Monday) for the event date and check if it
 is in a leap year.
c. Calculate and display the number of days from the current date to the event date.
2. Write a function to Format Event Details.
a. A Function, nicely format and display the event date and time, including the
 default system time zone.
Eg: Sunday, September 20, 2025 @ 10:30 [America/Chicago]
3. Time Zone Conversion function:
a. Convert the event's date and time from the system's default time zone to any other,
 specified time zone entered by the user.
Sample Time Zones
America/Panama
America/Chicago
America/Indiana/Indianapolis
America/Santiago
America/Phoenix
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String eventName;

        System.out.println(" Insert the name of the event: ");
        eventName = sc.nextLine();

        System.out.println(" Insert date of the event  YYYY-MM-DD  :");
        String input1 = sc.nextLine();
        LocalDate dateEvent = LocalDate.parse(input1);
        // Formatting event date
        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH);
        String formattedDate = dateEvent.format(formatting);

        System.out.println(" Insert time of the event - HH:MM - :");
        String input2 = sc.nextLine();
        LocalTime timeEvent = LocalTime.parse(input2);

        long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), dateEvent);


        System.out.println("Day of the week: " + dateEvent.getDayOfWeek());
        System.out.println("There are " + daysBetween + " days left until the event." );
        System.out.println("The Event " + eventName + " will be on " + dateEvent.getDayOfWeek() +", "+ formattedDate + " at :" + timeEvent + " America Central Time.");
       // Sunday, September 20, 2025 @ 10:30 [America/Chicago]

        System.out.println("Write Yes to change de Time Zone");
        String input3 = sc.nextLine();
        if (input3.equalsIgnoreCase("Yes")) {

            System.out.println("Enter new Time Zone (Example: America/Panama): ");
            String newZone = sc.nextLine();

            changeTimeZone(dateEvent, timeEvent, newZone);
        }


    }

    public static void changeTimeZone(LocalDate dateEvent,
                                      LocalTime timeEvent,
                                      String newZone) {

        // Combine date + time
        LocalDateTime localDateTime = LocalDateTime.of(dateEvent, timeEvent);

        // System default zone
        ZoneId systemZone = ZoneId.systemDefault();

        // Create ZonedDateTime in system zone
        ZonedDateTime systemZoned = localDateTime.atZone(systemZone);

        // Convert to new zone
        ZoneId targetZone = ZoneId.of(newZone);
        ZonedDateTime converted = systemZoned.withZoneSameInstant(targetZone);

        // Formatter
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "EEEE, MMMM dd, yyyy '@' HH:mm '['VV']'",
                        Locale.ENGLISH
                );

        System.out.println("\nConverted Event Time:");
        System.out.println(converted.format(formatter));
    }


}