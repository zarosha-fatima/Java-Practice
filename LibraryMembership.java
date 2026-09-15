import java.util.Scanner;

public class LibraryMembership {

    // Method 
    public static void assignMemberShip(String name, int age) {

        double price = 0;
        String membershipType = "";

        // Display 
        System.out.println("\nWelcome " + name.toUpperCase());

       
        if (age >= 12 && age <= 17) {
            membershipType = "Child Membership";
            price = 1500;
        } else if (age >= 18 && age <= 59) {
            membershipType = "Adult Membership";
            price = 3000;
        } else {
            membershipType = "Senior Membership";
            price = 5000;
        }

        System.out.println("Membership Type: " + membershipType);
        System.out.println("Membership Fee: $" + price);

        // Call method
        userPayment(price, name);
    }

    // Method 
    public static void userPayment(double price, String name) {

        Scanner input = new Scanner(System.in);
        double amount;

        System.out.print("Enter payment amount: ");
        amount = input.nextDouble();

        if (amount >= price) {
            System.out.println("Membership purchased successfully for " + name + "!");
        } else {
            System.out.println("Insufficient balance. Membership not purchased.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age;
        boolean validName;

        // Name validation
        System.out.print("Enter your full name: ");
        name = input.nextLine();

        validName = true;
        while (true) {
            validName = true;

            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (!Character.isLetter(ch) && ch != ' ') {
                    validName = false;
                    break;
                }
            }

            if (validName)
                break;
            else {
                System.out.println("Invalid name! Use only letters and spaces.");
                System.out.print("Enter your full name again: ");
                name = input.nextLine();
            }
        }

        // Age validation
        System.out.print("Enter your age: ");
        age = input.nextInt();

        while (age < 12 || age > 100) {
            System.out.println("Invalid age! Age must be between 12 and 100.");
            System.out.print("Enter your age again: ");
            age = input.nextInt();
        }

        // Assign membership
        assignMemberShip(name, age);

        // Ending message
        System.out.println("\nThank You for Using This System.");

        
    }
}