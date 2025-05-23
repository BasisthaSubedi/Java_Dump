package Level3;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int sumOfDivisors = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            if (sumOfDivisors > number) {
                System.out.println(number + " is an Abundant Number");
            } else {
                System.out.println(number + " is not an Abundant Number");
            }
        }
    }
}