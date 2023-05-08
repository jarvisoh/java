import java.util.Scanner;

public class GreatestThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digit, maxDigit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit > maxDigit && digit <= 9) {
                maxDigit = digit;
            }
            number /= 10;
        }
        System.out.printf("The greatest three-digit number using the digits of %d is: %d%d%d\n", 
                number, maxDigit, maxDigit, maxDigit);
    }
}
