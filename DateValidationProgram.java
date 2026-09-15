import java.util.Scanner;

public class DateValidationProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        scanner.close();

        // 1. Check for zero or negative values
        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println("Result: " + day + "/" + month + "/" + year + " is Invalid");
            System.out.println("Reason: Day, month, or year cannot be zero or negative.");
            return; // Stop the program
        }

        // 2. Check year range (1970 to 2025)
        if (year < 1970 || year > 2025) {
            System.out.println("Result: " + day + "/" + month + "/" + year + " is Invalid");
            System.out.println("Reason: Year must be between 1970 and 2025.");
            return; // Stop the program
        }
        
        // Check if month is valid (1-12)
 if (month < 1 || month > 12) {
            System.out.println("Result: " + day + "/" + month + "/" + year + " is Invalid");
            System.out.println("Reason: Month must be between 1 and 12.");
            return;
        }

        // 3. Determine maximum days in the given month and year
        int maxDays;
        if (month == 2) {
            if (isLeap(year)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else {
            maxDays = 31;
        }
 // Check if the day is valid for the specific month
        if (day > maxDays) {
            System.out.println("Result: " + day + "/" + month + "/" + year + " is Invalid");
            System.out.println("Reason: Day is out of range for the specified month and year.");
            return; // Stop the program
        }

        // If all conditions pass, the date is valid
        System.out.println("Result: " + day + "/" + month + "/" + year + " is Valid");
    }

    /**
     * Checks if a year is a leap year based on the standard rules.
     * A year is a leap year if it is divisible by 4, except for years
     * that are divisible by 100 but not by 400.
     *
     */
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }//class
   }//main
 