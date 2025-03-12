import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateOperations {
    public static void main(String[] args) {
        // 1. Get Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // 2. Create Specific Date
        LocalDate specificDate = LocalDate.of(2023, 10, 15);
        System.out.println("Specific Date: " + specificDate);

        // 3. Parse Date from String
        LocalDate parsedDate = LocalDate.parse("2022-05-20");
        System.out.println("Parsed Date: " + parsedDate);

        // 4. Get Year, Month, Day
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day of Month: " + today.getDayOfMonth());
        System.out.println("Day of Week: " + today.getDayOfWeek());
        System.out.println("Day of Year: " + today.getDayOfYear());

        // 5. Check if Leap Year
        System.out.println("Is Leap Year? " + today.isLeapYear());

        // 6. Add & Subtract Days, Months, Years
        System.out.println("After 10 days: " + today.plusDays(10));
        System.out.println("After 2 months: " + today.plusMonths(2));
        System.out.println("After 1 year: " + today.plusYears(1));

        System.out.println("10 days ago: " + today.minusDays(10));
        System.out.println("2 months ago: " + today.minusMonths(2));
        System.out.println("1 year ago: " + today.minusYears(1));

        // 7. Compare Dates
        LocalDate anotherDate = LocalDate.of(2024, 1, 1);
        System.out.println("Is Today before 2024-01-01? " + today.isBefore(anotherDate));
        System.out.println("Is Today after 2024-01-01? " + today.isAfter(anotherDate));
        System.out.println("Is Today equal to 2024-01-01? " + today.equals(anotherDate));

        // 8. Find Difference Between Dates
        long daysBetween = ChronoUnit.DAYS.between(today, anotherDate);
        System.out.println("Days until 2024-01-01: " + daysBetween);

        long monthsBetween = ChronoUnit.MONTHS.between(today, anotherDate);
        System.out.println("Months until 2024-01-01: " + monthsBetween);

        // 9. Format Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}

