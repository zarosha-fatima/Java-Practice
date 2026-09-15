
import java.util.Scanner;

public class Mobile_Sim_Package {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          System.out.println("==============================");
          System.out.println("Wellcome to SIM selector");
          System.out.println("==============================="); 

        // Display SIM options
        System.out.println("Select SIM:");
        System.out.println("1. Jazz");
        System.out.println("2. Zong");
        System.out.println("3. Ufone");
        System.out.println("4. Telenor");

        System.out.print("Enter SIM choice: ");
        int simChoice = sc.nextInt();

        double price = 0;
        String simName = "";
        String packageDetails = "";

        // SIM Selection
        if (simChoice == 1) {
            simName = "Jazz";
            System.out.println("Jazz Packages:");
            System.out.println("1. 2GB + 100 Minutes - $5");
            System.out.println("2. 5GB + 500 Minutes - $10");

            System.out.print("Select Package: ");
            int pkg = sc.nextInt();

            if (pkg == 1) {
                price = 5;
                packageDetails = "2GB Data + 100 Minutes";
            } else if (pkg == 2) {
                price = 10;
                packageDetails = "5GB Data + 500 Minutes";
            } else {
                System.out.println("Invalid Package Selection!");
                return;
            }

        } else if (simChoice == 2) {
            simName = "Zong";
            System.out.println("Zong Packages:");
            System.out.println("1. 3GB + 50 Minutes - $6");
            System.out.println("2. 10GB + 300 Minutes - $12");

            System.out.print("Select Package: ");
            int pkg = sc.nextInt();

            if (pkg == 1) {
                price = 6;
                packageDetails = "3GB Data + 50 Minutes";
            } else if (pkg == 2) {
                price = 12;
                packageDetails = "10GB Data + 300 Minutes";
            } else {
                System.out.println("Invalid Package Selection!");
                return;
            }

        } else if (simChoice == 3) {
            simName = "Ufone";
            System.out.println("Ufone Packages:");
            System.out.println("1. 1GB + 200 Minutes - $4");
            System.out.println("2. 4GB + 400 Minutes - $8");

            System.out.print("Select Package: ");
            int pkg = sc.nextInt();

            if (pkg == 1) {
                price = 4;
                packageDetails = "1GB Data + 200 Minutes";
            } else if (pkg == 2) {
                price = 8;
                packageDetails = "4GB Data + 400 Minutes";
            } else {
                System.out.println("Invalid Package Selection!");
                return;
            }

        } else if (simChoice == 4) {
            simName = "Telenor";
            System.out.println("Telenor Packages:");
            System.out.println("1. 2GB + 150 Minutes - $5");
            System.out.println("2. 6GB + 600 Minutes - $11");

            System.out.print("Select Package: ");
            int pkg = sc.nextInt();

            if (pkg == 1) {
                price = 5;
                packageDetails = "2GB Data + 150 Minutes";
            } else if (pkg == 2) {
                price = 11;
                packageDetails = "6GB Data + 600 Minutes";
            } else {
                System.out.println("Invalid Package Selection!");
                return;
            }

        } else {
            System.out.println("Invalid SIM Selection!");
            return;
        }

        // Balance input
        System.out.print("Enter your balance: $");
        double balance = sc.nextDouble();

        // Tax calculation
        double tax = price * 0.15;
        double totalCost = price + tax;

        // Balance check
        if (balance >= totalCost) {
            balance = balance - totalCost;

            System.out.println("\n----- Transaction Successful -----");
            System.out.println("SIM: " + simName);
            System.out.println("Package: " + packageDetails);
            System.out.println("Package Price: $" + price);
            System.out.println("Tax (15%): $" + tax);
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("Remaining Balance: $" + balance);

        } else {
            System.out.println("\nInsufficient Balance!");
            System.out.println("Required Amount: $" + totalCost);
            System.out.println("Please recharge your balance.");
                             System.out.println("==============================");
                             System.out.println("Thank you  for using our service");
                             System.out.println("==============================");    
        }

        sc.close();
    }
}