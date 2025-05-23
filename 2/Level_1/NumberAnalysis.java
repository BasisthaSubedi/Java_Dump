package Java_Array_Concepts.Level_1;
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            for (int num : numbers) {
                if (num > 0) {
                    System.out.print(num + " is positive and ");
                    System.out.println(num % 2 == 0 ? "even." : "odd.");
                } else if (num < 0) {
                    System.out.println(num + " is negative.");
                } else {
                    System.out.println(num + " is zero.");
                }
            }

            if (numbers[0] > numbers[4]) {
                System.out.println("First element is greater than last.");
            } else if (numbers[0] < numbers[4]) {
                System.out.println("First element is less than last.");
            } else {
                System.out.println("First and last elements are equal.");
            }
        }
    }
}