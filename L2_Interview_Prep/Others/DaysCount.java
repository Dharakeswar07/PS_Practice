package L2_Interview_Prep.Others;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysCount {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the from date (dd-MM-yyyy): ");
        String fromDateStr = scanner.nextLine();

        System.out.println("Enter the to date (dd-MM-yyyy): ");
        String toDateStr = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the dates
        LocalDate fromDate = LocalDate.parse(fromDateStr, formatter);
        LocalDate toDate = LocalDate.parse(toDateStr, formatter);

        // Calculate the number of days
        long numberOfDays = ChronoUnit.DAYS.between(fromDate, toDate);

        // Output the result
        System.out.println("Total number of days (including from date and excluding to date): " + numberOfDays);
    }*/
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Prompt user for input
      System.out.println("Enter the from date (dd-MM-yyyy): ");
      String fromDateStr = scanner.nextLine();

      System.out.println("Enter the to date (dd-MM-yyyy): ");
      String toDateStr = scanner.nextLine();

      // Parse the dates
      String[] fromDateParts = fromDateStr.split("-");
      String[] toDateParts = toDateStr.split("-");

      int fromDay = Integer.parseInt(fromDateParts[0]);
      int fromMonth = Integer.parseInt(fromDateParts[1]);
      int fromYear = Integer.parseInt(fromDateParts[2]);

      int toDay = Integer.parseInt(toDateParts[0]);
      int toMonth = Integer.parseInt(toDateParts[1]);
      int toYear = Integer.parseInt(toDateParts[2]);

      // Calculate the total number of days
      int totalDays = calculateDaysBetween(fromDay, fromMonth, fromYear, toDay, toMonth, toYear);

      // Output the result
      System.out.println("Total number of days (including from date and excluding to date): " + totalDays);

      scanner.close();
  }

    public static int calculateDaysBetween(int fromDay, int fromMonth, int fromYear, int toDay, int toMonth, int toYear) {
      if(fromYear <= toYear) {

          int daysFromStartToEndOfFromYear = (isLeapYear(fromYear) ? 366 : 365) - daysInYearUpTo(fromDay, fromMonth, fromYear);

          int daysFromStartToToDate = daysInYearUpTo(toDay, toMonth, toYear);

          int daysInFullYearsBetween = 0;
          for (int year = fromYear + 1; year < toYear; year++) {
              daysInFullYearsBetween += isLeapYear(year) ? 366 : 365;
          }

          int totalDays = daysFromStartToEndOfFromYear + daysFromStartToToDate + daysInFullYearsBetween;

          return totalDays;
      }
      else
      {
          return 0;
      }

    }

    public static boolean isLeapYear(int year) {
       if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int daysInYearUpTo(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
            if (i == 1 && isLeapYear(year)) {
                days++;  // Add one day for leap year
            }
        }
        days += day;
        return days;
    }

}


