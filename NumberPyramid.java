import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height;

        // Input validation (must be greater than 1)
        System.out.print("Enter the height of the pyramid (greater than 1): ");
        height = sc.nextInt();

        while (height <= 1) {
            System.out.print("Invalid input. Please enter a number greater than 1: ");
            height = sc.nextInt();
        }

        System.out.println();

        // Number Pyramid Logic
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        
    }
}