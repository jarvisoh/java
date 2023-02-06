import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: $" + payment);
        System.out.println("India:  Rs." + payment);
        System.out.println("China: ￥" + payment);
        System.out.println("France: " + payment+"€");
    }
}
