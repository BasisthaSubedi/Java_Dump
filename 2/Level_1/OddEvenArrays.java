package Java_Array_Concepts.Level_1;
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Error: Not a natural number.");
                return;
            }

            int[] oddNumbers = new int[number / 2 + 1];
            int[] evenNumbers = new int[number / 2 + 1];
            int oddIndex = 0, evenIndex = 0;

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex++] = i;
                } else {
                    oddNumbers[oddIndex++] = i;
                }
            }

            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) System.out.print(oddNumbers[i] + " ");

            System.out.print("\nEven numbers: ");
            for (int i = 0; i < evenIndex; i++) System.out.print(evenNumbers[i] + " ");
        }
    }
}