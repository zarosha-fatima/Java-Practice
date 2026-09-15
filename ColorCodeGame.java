import java.util.Random;
import java.util.Scanner;

public class ColorCodeGame {

    // Method 
    public static String generateColor() {
        Random rand = new Random();
        int num = rand.nextInt(6); // 0 to 5

        if (num == 0)
            return "Red";
        else if (num == 1)
            return "Blue";
        else if (num == 2)
            return "Green";
        else if (num == 3)
            return "Yellow";
        else if (num == 4)
            return "Purple";
        else
            return "Orange";
    }

    // Method 
    public static int matchCode(String c1, String c2, String c3, int betAmount) {
        int matchCount = 0;

        if (c1.equals(c2))
            matchCount++;
        if (c1.equals(c3))
            matchCount++;
        if (c2.equals(c3))
            matchCount++;

        if (matchCount == 0)
            return 0;
        else if (matchCount == 1)
            return betAmount * 2;   // two colors match
        else
            return betAmount * 4;   // three colors match
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int betAmount = 0;
        int totalBet = 0;
        int totalWin = 0;
        String playAgain = "yes";

        while (playAgain.equals("yes")) {

            // Validate bet amount using while loop
            System.out.print("Enter bet amount (positive number): ");
            betAmount = input.nextInt();

            while (betAmount <= 0) {
                System.out.print("Invalid amount. Enter again: ");
                betAmount = input.nextInt();
            }

            totalBet += betAmount;

            // Generate three colors
            String color1 = generateColor();
            String color2 = generateColor();
            String color3 = generateColor();

            System.out.println("Generated Colors: " + color1 + ", " + color2 + ", " + color3);

            // Calculate 
            int winAmount = matchCode(color1, color2, color3, betAmount);
            totalWin += winAmount;

            if (winAmount > 0)
                System.out.println("You won $" + winAmount);
            else
                System.out.println("You won $0");

            // Validate play again input
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.next();

            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
                System.out.print("Invalid input. Enter yes or no: ");
                playAgain = input.next();
            }
        }

        // Final result
        System.out.println("\nGame Over!");
        System.out.println("Total Money Entered: $" + totalBet);
        System.out.println("Total Money Won: $" + totalWin);

        
    }
}