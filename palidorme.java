import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String temp="";
        char ch;
        for(int i=0;i<A.length();i++)
        {
            ch= A.charAt(i); 
        temp=ch+temp; 
        }
     
       if(stringCompare(A,temp)==0)
       {
  System.out.print("Yes");
       }
       else
       {
 System.out.print("NO");
       }
     //  System.out.print(A==temp ? "No":"Yes");
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



