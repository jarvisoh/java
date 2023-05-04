import java.util.*;

public class FirstNonRepeatingChar {

    // Function to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String s)
     {
        Map<Character, Integer> count = new HashMap<>(); // map to store the count of each character in the string
        for (char c : s.toCharArray()) 
        {
            System.out.print("\nc->"+c);
            count.put(c, count.getOrDefault(c, 0) + 1);
            System.out.print("\ncount->"+count.getOrDefault(c,0));
        }
        //  for (char c : s.toCharArray()) 
        // {
        //     System.out.print(count.getOrDefault(c,0));
        // }
        for (char c : s.toCharArray()) {

            if (count.get(c) == 1) {
                return c;
            }
        }
        
        return '#';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine();
        
        // Process each test case
        for (int i = 0; i < t; i++) 
        {
            String s = scanner.nextLine();
            System.out.print("->"+s);
            char result = findFirstNonRepeatingChar(s);
            System.out.println("\n"+result);
        }
        
        scanner.close();
    }
}
