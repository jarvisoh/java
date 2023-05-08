import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the input value

        int[] arr = new int[n]; // Create an array to hold the sequence

        // Initialize the first two elements
        arr[0] = 0;
        arr[1] = 1;

        // Fill in the rest of the array based on the given pattern
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i-2] + 2;
            } else {
                arr[i] = arr[i-2] - 1;
            }
        }

        // Print the sequence as specified
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
