import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, t1 = 0, t2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = scanner.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
