import java.util.Arrays;

public class StringCount {
    public static void main(String[] args) {
        String[] arr = {"hello", "hello", "class", "world", "world", "java"};
        int n = arr.length;
        int[] count = new int[n];

        // Count the frequency of each string
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count[i]++;
                    count[j]++;
                }
            }
        }

        // Find the strings with count greater than 1 and print them in ascending order
        int numDuplicates = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > 0) {
                numDuplicates++;
            }
        }
        String[] duplicates = new String[numDuplicates];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > 0) {
                duplicates[index] = arr[i];
                index++;
            }
        }
        Arrays.sort(duplicates);

        System.out.println("Strings present more than once in ascending order:");
        for (String s : duplicates) {
            System.out.println(s);
        }
    }
}
